package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		String x = scan.next();
		int total = 0;
		String [] arr = x.split("");
		
		for(int i=0; i<arr.length; i++) {
			total += Integer.parseInt(arr[i]);
		}
		System.out.println(total);
	}
	
}
