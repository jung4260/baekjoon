package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class baekjoon_1037 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
 		
		int n = Integer.parseInt(bf.readLine());
		String [] arr = bf.readLine().split(" ");
		
		List <Integer> list = new LinkedList<>();
		
		
		if(arr.length == 1) {
			System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[0]));
		}else {
			for(int i=0; i<arr.length; i++) {
				list.add(Integer.parseInt(arr[i]));
				Collections.sort(list);
			}
			System.out.println(list.get(0) * list.get(arr.length-1));
		}
		

		
		
	}
	
	
}
