package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class test1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list= new ArrayList<Integer>();
		String date=br.readLine();
		for(int i=0;i<date.length();i++) {
		list.add(Integer.parseInt(date.charAt(i)+"")); 	
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for(Integer i:list) {
			System.out.print(i);
		}
	}

}
