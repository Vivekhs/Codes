package problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicalWord {
 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 List<Integer> primeList = new ArrayList<Integer>();
	 for(int i =65; i<94;i++){
		if(checkPrime(i)){
			primeList.add(i);
		}
	 }
	 Object[] arr = primeList.toArray();
	 String s1 = sc.next();
	 char[] chArr = s1.toCharArray();
	 int j=0;
	 for(int i=0;i<chArr.length ; i++){
		 j = getClosestIndex(arr, i);
		 chArr[i] = (char)((int)arr[i]);
	 }
	 System.out.println(Arrays.toString(arr));
 }
 
 private static boolean checkPrime(int i){
	 int k = (int) Math.sqrt(i);
	 int j=2;
	 for(;j <=k ;j++){
		 if(i%j == 0){
			 break;
		 }
	 }
	 if(j>k)
		 return true;
	 
	return false;
	 
 }

 
}
