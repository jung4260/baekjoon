package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class baekjoon_1764 {
	
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] input = br.readLine().split(" ");
 		
		int n = Integer.parseInt( input[0] );
		int m = Integer.parseInt( input[1] );
		
		HashSet<String> hashList = new HashSet<>();
		ArrayList<String> arrayList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			hashList.add(br.readLine());
		}
		
		for(int i=0; i<m; i++) {
			String cumulative = br.readLine();
			if( hashList.contains( cumulative )) {
				arrayList.add(cumulative);
			};
		}
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList.size());
		for(String name : arrayList) {
			System.out.println(name);
		}
	}

}
