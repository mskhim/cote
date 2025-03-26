package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class test10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dataA = sc.nextInt();
		HashSet<Integer> setA = new HashSet<Integer>();
		sc.nextLine();
		for (int i = 0; i < dataA; i++) {
			setA.add(sc.nextInt());
		}
		int dataB = sc.nextInt();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		for (int i = 0; i < dataB; i++) {
			listB.add(sc.nextInt());
		}
		for (int i = 0; i < dataB; i++) {
			int count = 0;
			Iterator<Integer> it=setA.iterator();
			while(it.hasNext()) {
				if(listB.get(i)==it.next()) {
					count=1;
				}
			}
			System.out.print(count+" ");
		}

	}

}
