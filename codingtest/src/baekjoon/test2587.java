package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2587 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum=0;
		for(int i=0 ;i<5;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for(Integer i:list) {
			sum+=i;
		}
		System.out.println(sum/5);
		System.out.println(list.get(2));
	}

}
