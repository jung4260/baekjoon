package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class baekjoon_14425 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		
 		int N = scan.nextInt();
 		int M = scan.nextInt();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			String nWord = scan.next();
			set.add(nWord);
		}
		
		for(int i=0; i<M; i++) {
			String mWord = scan.next();
			if(set.contains(	mWord	)	) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
