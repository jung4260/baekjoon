package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baekjoon_2750_redo {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        
        Integer [] list = new Integer [count];
        
        
        for(int i=0; i<count; i++) {
        	list[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0; i<count; i++) {
        	for(int j=0; j<count-1; j++) {
        		if(list[i] < list[j]) {
        			int temp = list[i];
        			list[i] = list[j];
        			list[j] = temp;  			
        		}
        	}
        	
        }
        
        for(Integer x : list) {
        	System.out.println(x);
        }
        
        
    }
}
