package example.chapter1;

import java.util.Scanner;

public class Q2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i=1;i<=N;i++) {
			for(int k=1; k<=N-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=((2*i)-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
