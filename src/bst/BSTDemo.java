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
		int N = sc.nextInt();
		for(int i = 0; i< N;i++){
			int number = random.nextInt(100);
			System.out.println(number);
			bst.add(number+1);
		}
		bst.display(bst.getRoot());
		List<Node> sortedElems = new ArrayList<Node>(); 
		bst.inorderTraversal(bst.getRoot(), sortedElems);
		System.out.println("Inorder Traversal: ");
		for(Node node : sortedElems) {
			System.out.println(node.data);
		}
		bst.preorderTraversal(bst.getRoot(), sortedElems);
		System.out.println("Pre-Order Traversal: ");
		for(Node node : sortedElems) {
			System.out.println(node.data);
		}
		sc.close();
	}

}
