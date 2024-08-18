package baekjoon;

import java.util.Scanner;

public class baekjoon_2525 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int setTime = scan.nextInt();
	
		m += setTime;
		
		if(m > 60) {
			h += m / 60;
			m = m % 60;
			if(h >= 24) {
				h = h % 24;
			}
		}
		
		
		System.out.println(h+" "+ m);
		
		
		
	}
	
}
