/**
 * 
 */
package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vivekrjt
 *
 */

class Name{
	String firstName;
	String lastName;
	int order;
	
	Name(String firstName, String lastName, int order){
		this.firstName = firstName;
		this.lastName = lastName;
		this.order = order;
	}
}
public class JavaSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		List<Name> nameObjList = new ArrayList<Name>();
		
		nameObjList.add(new Name("Ved", "Prakash", 5));
		nameObjList.add(new Name("Vivek", "sinha", 6));
		nameObjList.add(new Name("Vishal", "Kumar", 1));
		
		nameList.add("Vivek");
		nameList.add("Sinha");
		nameList.add("Vishal");
		nameList.add("Kumar");
		
		Collections.sort(nameList);
		for(String name: nameList) {
			System.out.println(name);
		}
		
		nameObjList.sort((Name prev, Name current)->{
			return prev.order - current.order;
		});
		
		for(Name name: nameObjList) {
			System.out.println(name.firstName);
		}
		

	}

}
