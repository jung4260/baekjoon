package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class baekjoon_1157_redo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine().toUpperCase();
		int maxCount = 0;
	    char maxChar = '?';
		
		Map<Character, Integer> mapList = new HashMap <> ();
		ArrayList<Character> arrayList = new ArrayList<>();
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			mapList.put(ch, mapList.getOrDefault(ch, 0) + 1);
			
		}
		
	    for(Map.Entry<Character, Integer> entry : mapList.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            } else if(entry.getValue() == maxCount) {
                maxChar = '?'; 
            }
        }
	    System.out.println(maxChar);
		
		
		
		
	}

}
