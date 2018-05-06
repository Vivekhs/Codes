package bst;
import java.util.Random;
import java.util.Scanner;

public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random  random = new Random();
		BinarySearchTree bst =new BinarySearchTree();
		int N = sc.nextInt();
		
		for(int i = 0; i< N;i++){
			
			bst.add(random.nextInt(100)+1);
		}
		bst.display(bst.getRoot());
		sc.close();
	}

}
