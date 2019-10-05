package hackerrank;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		float positiveCount = 0;
		float negativeCount = 0;
		float zeroCount = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(i>0) {
				positiveCount++;
			}
			else if(i == 0) {
				zeroCount++;
			}
			else {
				negativeCount++;
			}
		}

		System.out.println(positiveCount/arr.length);
		System.out.println(negativeCount/arr.length);
		System.out.println(zeroCount/arr.length);
    }
}
