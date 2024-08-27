package baekjoon;

import java.util.Scanner;

public class baekjoon_2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
	
		if(N == 4 || N == 7) {
			System.out.println(-1);
		}else if(N % 5 == 0) {
			System.out.println(N / 5);
		}else if(N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}else {
			System.out.println((N / 5) + 2);
		}
	}
	
	
}
