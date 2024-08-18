package baekjoon;

import java.util.Scanner;

public class baekjoon_10952 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		int number = scan.nextInt() -1;
		
		char answer = word.charAt(number);
		
		System.out.println(answer);
		
		
	}
	
}
