package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test25305 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int price=sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0 ;i<num;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-price));
	}

}
