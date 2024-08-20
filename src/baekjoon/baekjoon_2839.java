package baekjoon;

import java.util.Scanner;

public class baekjoon_2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int kg = scan.nextInt();
		int sum = 0;
		int five = kg/5;
		int three = kg/3;
		int leftover = 0;
		
		if(kg == 0) {
			sum -=1;
		}else if(kg <=5 && kg%5 == 0) {
			sum += 1;
		}else if(kg <=5 && kg%3 == 0) {
			sum += 1;
		}else if (kg <= 4 && kg%3 != 0) {
			sum -= 1;
		}else if (kg > 5) {
			sum += kg/5;
			leftover = kg-(5*sum);
			System.out.println(leftover);
			if(leftover%3 == 0) {
				sum += leftover/3;
			}else if(leftover >= 3){
				sum += leftover/3 + 1;
			}else{
				sum += 1;
			}
//			sum += leftover/3;
		}
//		
//		sum += kg/5;			
//		leftover = kg-(5*sum);			
//		sum += leftover/3;
		
//		System.out.println("kg%5:" + 18%5 );
//		System.out.println("kg/5:" + 11/5);
		//나머지가 4개일 때 3키로 2개
		System.out.println("kg%3:" + 4%3);
		System.out.println("kg/3:" + 3/3);
		System.out.println(sum);
		
	}
	
	
	
}
