package baekjoon_silver;

import java.text.DecimalFormat;
import java.util.Scanner;

public class baekjoon_1312 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// A : 분자, B : 분모
		int A = sc.nextInt();
		int B = sc.nextInt();
		// 소숫점 아래 N번째 수
		int N = sc.nextInt();
		int num = A%B;
		System.out.println(num);
		for (int i = 0; i < N-1; i++) {
			System.out.println(num);
			num *= 10;
			num %= B;
			System.out.println(num);
		}
		num *= 10;
		System.out.print(num/B);
		sc.close();
	}
}
