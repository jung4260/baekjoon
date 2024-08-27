package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon_10988 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine();


		ArrayList<Character> arr1 = new ArrayList<>();
		ArrayList<Character> arr2 = new ArrayList<>();
		
		if(word.length()%2 == 0) {
			for(int i=0; i<word.length()/2; i++) {
				arr1.add(word.charAt(i));
			}
			for(int i=word.length()-1; i>=word.length()/2; i--) {
				arr2.add(word.charAt(i));
			}
			if(arr1.equals(arr2)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
			
		}else {
			for(int i=0; i<word.length()/2; i++) {
				arr1.add(word.charAt(i));
			}
			for(int i=word.length()-1; i>=word.length()/2+1; i--) {
				arr2.add(word.charAt(i));
			}
		
			if(arr1.equals(arr2)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}
		
		
		
	
	}

}
