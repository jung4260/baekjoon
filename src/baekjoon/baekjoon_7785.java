package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class baekjoon_7785 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		List<String> list = new ArrayList<>();
		
		Map<String, String> entrance = new HashMap();

		for(int i=0; i<N; i++) {
			String [] history = bf.readLine().split(" ");
			String name = history[0];
			String workHis = history[1];
			entrance.put(name, workHis);
		}

		for(String key : entrance.keySet()) {
			if(entrance.get(key).equals( "enter" ) ) {
				list.add(key);
			}
		}
		
		Collections.sort(list, Collections.reverseOrder() );
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
