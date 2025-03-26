package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);  
		for(Integer data:list) {
			System.out.println(data);
		}
	}

}
