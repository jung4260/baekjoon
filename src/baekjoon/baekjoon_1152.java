package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1152 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String answer = sentence.trim();
		String [] arr = answer.split(" ");
		
		if(arr[0] == "") {
			System.out.println(0);
		}else {
		System.out.println(arr.length);
	
		}
	}
	
}
