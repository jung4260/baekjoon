package baekjoon;

import java.util.Scanner;

public class baekjoon_2884 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt() - 45;
		
		if(M < 0) {
			H = H - 1;
			M = (60 + M);
		}
		
		if(H < 0) {
			H = 23;
		}
		
		System.out.println(H+" "+M);
		scan.close();
		
	}

}
