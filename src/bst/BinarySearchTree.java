/**
 * 
 */
package bst;

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
		if(node.data < data){
			return node.prev == null ? node:getNodeToAdd(node.prev, data);
		}
		else{
			return node.next == null ? node:getNodeToAdd(node.next, data);
		}
		
	}
	
	public void display(Node node){
		System.out.println(node.data);
		if(node.next != null){
			display(node.next);
		}
		if(node.prev != null){
			display(node.prev);
		}
	}
	public Node getRoot() {
		return root;
	}
	
}
