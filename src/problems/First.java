package problems;

import java.util.Scanner;

public class First {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(n*2);
		System.out.println(str);
		
		sc.close();
	}
}