/**
 * 
 */
package com.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 * @author vivekrjt
 *
 */
public class ALGraph {
	
	private class Graph{
		int nodes;
		LinkedList<Integer>[] nodesList;
		Map<String, Integer> nodesMap;
		public Graph(int nodes) {
			this.nodes = nodes;
			nodesMap = new HashMap<String, Integer>();
			nodesList = new LinkedList[nodes]; 
			for(int i=0;i<nodes;i++) {
				nodesList[i] = new LinkedList<Integer>();
			}
		}
		public void addEdge(int from, int to) {
			
			if(!(nodesMap.get(from+to+"") !=null || nodesMap.get(to+from+"") != null )) {
				
				// if u don't want self loop, add from != to 
				// nodeList[from].addList(to) also.
				nodesList[from].addFirst(to);
				if(from!=to)
				nodesList[to].addFirst(from);
				nodesMap.put(from+to+"", to);
			}
		}
		
		public void display() {
			for(int i=0;i<nodes;i++) {
				System.out.print("Adjacent to node "+i);
				for(Integer node : nodesList[i]) {
					System.out.print("-> "+node);
				}
				System.out.println("\n");
			}
		}
		
		public void BSTPrint(boolean[] trackVisited, Queue<Integer> nodeQueue, Integer popedNode) {
			
			for(Integer node: nodesList[popedNode]) {
				if(!trackVisited[node]) {
					nodeQueue.add(node);
					trackVisited[node] = true;
				}
					
			}
			popedNode = nodeQueue.poll();
			if(popedNode == null) {
				return;
			}
			System.out.print(" => "+popedNode);
			BSTPrint(trackVisited, nodeQueue, popedNode);
			
		}
		public void BSTTraversal(int startNode) {
			boolean[] trackVisited = new boolean[nodes];
			System.out.print("Start ");
			Queue<Integer> nodeQueue = new ArrayDeque<Integer>();
			nodeQueue.add(startNode);
			trackVisited[startNode] = true;
			BSTPrint(trackVisited, nodeQueue, startNode);
			
			
		}
		
		public void DFSTraversal(int startNode) {
			Stack<Integer> nodeStack = new Stack<Integer>();
			boolean[] trackVisited = new boolean[nodes];
			System.out.print("Start ");
			printDFS(trackVisited, nodeStack, startNode);
			
			
		}
		
		private void printDFS(boolean[] trackVisited, Stack<Integer> nodeStack, Integer node) {
			if(!trackVisited[node]) {
				System.out.print(" => "+node);
				nodeStack.push(node);
				trackVisited[node] = true;
			}
			
			
			for(Integer tempNode : nodesList[node]) {
				if(!trackVisited[tempNode]) {
					printDFS(trackVisited, nodeStack, tempNode);
					return;
				}
			}
			if(nodeStack.empty()) {
				return;
			}
			Integer tempNode = nodeStack.pop();
			
			if(tempNode != null) {
				printDFS(trackVisited, nodeStack, tempNode);
			}
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ALGraph alGraph = new ALGraph();
		ALGraph.Graph graph = alGraph.new Graph(5);
		Random random = new Random();
		for(int i=0 ;i <10;i++) {
			graph.addEdge(random.nextInt(5), random.nextInt(5));
			
		}
		
//		graph.addEdge(0, 0);
//		graph.addEdge(1, 1);
//		graph.addEdge(1, 1);
//		graph.addEdge(1, 2);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 4);
		graph.display();
		
		
		graph.BSTTraversal(random.nextInt(5));
		System.out.println("");
		graph.DFSTraversal(random.nextInt(5));

	}

}