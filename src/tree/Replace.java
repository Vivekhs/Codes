package tree;

import java.util.Collections;
import java.util.LinkedList;

public class Replace {

	public static void main(String a[]){
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("is");
		list.add("multithreaded");
		list.add("and");
		list.add("Platform");
		list.add("Independent");
		
		Collections.swap(list, 2, 6);
		for(String str: list){
			System.out.print(" "+str);
		}
	}
}