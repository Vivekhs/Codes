/**
 * 
 */
package com.problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class NQueensBacktracking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] board = new int[N][N];
		sc.close();
		if(!nQueens(board, N)){
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		for(int i =0; i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	private static boolean nQueens(int[][] board, int N){
		if(N==0){
			return true;
		}
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				if(isAttacked(i, j, board)){
					continue;
				}
					board[i][j] = 1;
					
					if(nQueens(board, N-1)){
						return true;
					}
					board[i][j] = 0;
					
			}
		}
		
		return false;
		
	}
	private static boolean isAttacked(int i, int j, int[][] board){
		
		int N = board.length;
		
		for(int k = 0; k<N; k++){
			if(board[i][k] == 1){
				return true;
			}
			if(board[k][j] == 1){
				return true;
			}
		}
		
		for(int p =0;p<N;p++){
			for(int q=0;q<N;q++){
//				if(board[p][q] ==1 && Math.abs(i-p) == Math.abs(j-q)){
//					return true;
//				}
				if(board[p][q] ==1 && ( ( p+q == i+j) || (p-q == i-j))){
					return true;
				}
			}
		}
		
		return false;
	}
}
