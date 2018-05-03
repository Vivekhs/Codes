package com.challenges;

import java.util.Scanner;

/**
 * @author vivek sinha
 *
 */

public class PopUpOrientation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		int x_width, y_height, l_width, m_height,top, right, bottom, left;
		
		for(int i =0; i < testCases; i++) {
			
			x_width = sc.nextInt();
			y_height = sc.nextInt();
			l_width = sc.nextInt();
			m_height = sc.nextInt();
			left = sc.nextInt();
			bottom = sc.nextInt();
			
			top = y_height - bottom;
			right = x_width - left;
			
			if(right >= l_width && bottom>=m_height) {
				System.out.println("bottom-right");
			}
			else if(left >= l_width && bottom>=m_height) {
				System.out.println("bottom-left");
			}
			else if(right >= l_width && top>=m_height) {
				System.out.println("top-right");
			}
			else if(left >= l_width && top>=m_height) {
				System.out.println("top-left");
			}
			
		}
			sc.close();
	}

}

