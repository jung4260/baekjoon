package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2501 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String [] givenNum = bf.readLine().split(" ");
		
		int N = Integer.parseInt(givenNum[0]);
		int K = Integer.parseInt(givenNum[1]);
		
		int i = 0;
		int count = 1;
		int [] arr = new int [K];
		
		while(count <= N) {
			
			
			if(N % count == 0) {
				arr[i] = count;
				i++;
			}
			
			count++;
			
			if(i == K) {
				break;
			}
						
		}
		
		System.out.println(arr[K-1]);
		
		
		
		
		
	}
	
}
