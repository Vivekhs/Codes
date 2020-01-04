/**
 * 
 */
package bst;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

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
	
	public void postTraversal(Node node, List<Node> elements) {
		if(node.prev != null) {
			inorderTraversal(node.prev, elements);
		}
		if(node.next != null) {
			inorderTraversal(node.next, elements);
		}
		elements.add(node);
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
	// BFS
	List<Node> levelOrderTraversal(Node node) {
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(node);
		nodeQueue.add(null);
		while(nodeQueue.size() > 0) {
			node = nodeQueue.poll();
			
			if(node == null) {
				if(nodeQueue.size() > 0) {
					nodeQueue.add(null);
					System.out.println();
				}
			}
			else {
				System.out.print(node.data + " ");
				if(node.prev != null) {
					nodeQueue.add(node.prev);
				}
				if(node.next != null) {
					nodeQueue.add(node.next);
				}
			}
		}
		
		return null;
	}
	
	class TopViewNode{
		int verticalDistance;
		Node node;
		public TopViewNode(Node node, int verticalDistance) {
			this.node = node;
			this.verticalDistance = verticalDistance;
		}
		
		
	}
	
	void topView(Node node) {
		if(node == null) {
			return;
		}
		Queue<TopViewNode> topViewQueue = new LinkedList<TopViewNode>();
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
		TopViewNode topViewNode = new TopViewNode(node, 0);
		topViewQueue.add(topViewNode);
		while(!topViewQueue.isEmpty()) {
			topViewNode = topViewQueue.poll();
			if(topViewMap.get(topViewNode.verticalDistance) == null) {
				topViewMap.put(topViewNode.verticalDistance, topViewNode.node);
			}
			if(topViewNode.node.prev != null) {
				TopViewNode leftChildNode = new TopViewNode(topViewNode.node.prev, topViewNode.verticalDistance-1);
				topViewQueue.add(leftChildNode);
			}
			if(topViewNode.node.next != null) {
				TopViewNode rightChildNode = new TopViewNode(topViewNode.node.next, topViewNode.verticalDistance+1);
				topViewQueue.add(rightChildNode);
			}
		}
		for(Entry<Integer, Node> nodeInfo: topViewMap.entrySet()) {
			System.out.println(nodeInfo.getValue().data);
		}
	}
	
	void leftView(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		if(node.prev != null) {
			leftView(node.prev);
		}
		else if(node.next != null) {
			leftView(node.next);
		}
	}
}
