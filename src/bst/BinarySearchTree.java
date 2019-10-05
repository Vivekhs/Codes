/**
 * 
 */
package bst;

import java.util.List;

/**
 * @author Vivek Sinha
 *
 */
public class BinarySearchTree {
	
	private Node root;
	
	
	public void add(int data){
		Node node = new Node(data);
		if(root == null){
			root = node;
			return;
		}
		
		Node whereNode = getNodeToAdd(root, data);
		if(whereNode.data > data){
			whereNode.prev = node;
		}
		else{
			whereNode.next = node;
		}
		
	}
	private Node getNodeToAdd(Node node, int data){
		if(node.data > data){
			return node.prev == null ? node:getNodeToAdd(node.prev, data);
		}
		else{
			return node.next == null ? node:getNodeToAdd(node.next, data);
		}
	}
	
	public void display(Node node){
		System.out.println("Data : "+node.data);
		if(node.next != null){
			display(node.next);
		}
		if(node.prev != null){
			display(node.prev);
		}
	}
	
	public void inorderTraversal(Node node, List<Node> elements) {
			if(node.prev != null) {
				inorderTraversal(node.prev, elements);
			}
			elements.add(node);
			if(node.next != null) {
				inorderTraversal(node.next, elements);
			}
	}
	
	public void preorderTraversal(Node node, List<Node> elements) {
		elements.add(node);
		if(node.prev != null) {
			preorderTraversal(node.prev, elements);
		}
		if(node.next != null) {
			preorderTraversal(node.next, elements);
		}	
		
	}
	
	public Node getRoot() {
		return root;
	}
	
}
