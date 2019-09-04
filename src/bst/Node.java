/**
 * 
 */
package bst;

/**
 * @author Vivek Sinha
 *
 */
public class Node {
	
	Node prev;
	int data;
	Node next;
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	Node(int data){
		this.data = data;
	}
	

}
