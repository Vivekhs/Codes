/**
 * 
 */
package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Vivek Sinha  
 */

class Node {
	String key;
	String data;
	Node prev;
	Node next;
	Node(String key, String data){
		
	}
	
}

class Cache {
	private Map<String, Node> hashCacheMap;
	private Node start;
	private Node end;
	private int CACHE_SIZE;
	
	public Cache(){
		this.hashCacheMap = new HashMap<String, Node>();
		this.CACHE_SIZE = 20;
	}
	
	public void set(String key, String data){
		Node node = hashCacheMap.get(key);
		if(node != null) {
			node.data = data;
			remove(node);
			addAtStart(node);
		}
		else {
			if(hashCacheMap.size() >= CACHE_SIZE) {
				remove(end);
			}
			node = new Node(key, data);
			addAtStart(node);
		}
	}
	
	public String get(String key) {
		Node node = hashCacheMap.get(key);
		if(node != null) {
			return node.data;
		}
		return null;
	}
	
	/**
	 * 
	 * @param node
	 */
	public void remove(Node node) {
		if(node.next != null) {
			node.next.prev = node.prev;
		}
		// removing last node
		else {
			end = node.prev;
		}
		if(node.prev != null) {
			node.prev.next = node.next;
		}
		// removing first node
		else {
			start = null;
		}
	}
	
	
	private void addAtStart(Node node) {
		
		node.next = start;
		if(start != null) {
			start.prev = node;
		}
		else {
			end = node;
		}
		start = node;
	}
	
	public void setCapacity(int capacity) {
		CACHE_SIZE = capacity;
	}
	
}

public class DemoCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println();
	}

}
