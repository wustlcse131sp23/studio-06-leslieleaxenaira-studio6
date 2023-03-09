package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if (n==0) {
			return 0;
		}
		
		else {
			return Math.pow(0.5,n)+geometricSum(n-1);
		}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if (p%q == 0) {
			return q;
		}
		else {
			return gcd(q,p%q);
		}
		
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helper(int[] array, int[]n, int index) {
		
		if (index > array.length/2) { // base case
			return n;
		}
		else {
			int temp = array[array.length-index-1];
			n[index] = temp;
			n[array.length-index-1] = array[index];
			return helper(array,n,index + 1);
		}
		
	}
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		if (array.length == 0) {
			int[] tn = new int[0];
			return tn;
		}
		else {
			int[] n = new int[array.length];
			return helper(array,n,0);
		}
//		for ( int i = 0; i < array.length; i++)
//		{
//			for (int j = 1; j < arrayLength - i; j++)
//			{
//				if (array[j-1] > array [j])
//				{
//					int t = array [j];
//					array [j] = array [j-1];
//					array [j-1] = t;
//				}
//			}
//		}

		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
