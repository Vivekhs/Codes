package bst;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random  random = new Random();
		BinarySearchTree bst =new BinarySearchTree();
		int N ;
		int[] arr = {
				70,
				54,
				36,
				61,
				98,
				99,
				100
		};
		for(int i = 0; i< 7;i++){
			int number = random.nextInt(100)+1;
			//System.out.println(number);
			bst.add(arr[i]);
		}
		
		bst.display(bst.getRoot());
//		List<Node> sortedElems = new ArrayList<Node>(); 
//		bst.inorderTraversal(bst.getRoot(), sortedElems);
//		System.out.println("Inorder Traversal: ");
//		for(Node node : sortedElems) {
//			System.out.println(node.data);
//		}
//		bst.preorderTraversal(bst.getRoot(), sortedElems);
//		System.out.println("Pre-Order Traversal: ");
//		for(Node node : sortedElems) {
//			System.out.println(node.data);
//		}
//		System.out.println("Level order traversal");
//		bst.levelOrderTraversal(bst.getRoot());
//		System.out.println("Top View : ");
//		bst.topView(bst.getRoot());
//		System.out.println("Left view: ");
//		bst.leftView(bst.getRoot());
		sc.close();
	}

	
}
