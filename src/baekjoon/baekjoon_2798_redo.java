package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2798_redo {

	public static void main(String[] args) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String [] givenNum = br.readLine().split(" ");
			
			String [] blackJack = br.readLine().split(" ");

			int length = blackJack.length;
			
			int condition = Integer.parseInt(givenNum[1]);
			int temp = 0;
			int sum = 0;
			
			for(int i=0; i<length-2; i++) {
				for(int j=i+1; j<length-1; j++) {
					for(int k=j+1; k<length; k++) {
						
						int x = Integer.parseInt(blackJack[i]);						
						int y = Integer.parseInt(blackJack[j]);						
						int z = Integer.parseInt(blackJack[k]);
					
						sum = x + y + z;
						System.out.println("temp:" + temp);
						System.out.println("sum:"+sum);
						if(sum <= condition && temp < sum) { //sum이 조건보다 작거나 같거나 && sum이 temp보다 크면
							temp = sum;
						}
							
					}
				}
			}
			System.out.println(temp);
			
			
	}
	
}
