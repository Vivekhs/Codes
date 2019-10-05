/**
 * 
 */
package hackerrank;

/**
 * @author vivekhs
 *
 */
public class JumpingOnTheClouds {
	static int jumpingOnClouds() {
		int[] c = 
			{
					0, 0, 1, 0, 0, 1, 0
			};
		int totalJumps = 0;
		int currentJump =0;
		for(int i=1; i<c.length; i++) {
			currentJump++;
			if(currentJump==2) {
				if(c[i]==1) {
					currentJump =1;
					totalJumps++;
				}
				else {
					currentJump=0;
					totalJumps++;
				}
				
			}
		}
		if(currentJump==1) {
			totalJumps++;
		}
		System.out.println(totalJumps);
		return totalJumps; 


    }
	
	public static void main(String args[]) 
	{
		jumpingOnClouds();
	}
	

}
