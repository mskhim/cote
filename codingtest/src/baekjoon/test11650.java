package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test11650 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> list= new ArrayList<String>();
		int num= sc.nextInt();
		sc.nextLine();
		for(int i =0 ;i<num;i++) {
			list.add(sc.nextLine());
		}
		Collections.sort(list);
		for(String data:list) {
		System.out.println(data);
		}
	}
}
