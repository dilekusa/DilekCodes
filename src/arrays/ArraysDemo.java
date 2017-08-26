package arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] myIntArray1 = { 100, 90 };
		/*
		 * myIntArray1 = new int[10]; // how do i give the values myIntArray1[0]
		 * = 100; myIntArray1[1] = 90;
		 */

		System.out.println("0 index: " + myIntArray1[0]);
		//System.out.println("1st index: " + myIntArray
				
				
				
//	//			1[1]);
//		System.out.println("2nd index: " + myIntArray1[2]);// if I did not give
//															// a value java
//															// gives a default
//															// value 0
//
//		String[] myStringArray1 = { "bmw", "audi", "honda" };
//
//		System.out.println("0 index: " + myStringArray1[0]);
//		System.out.println("1st index: " + myStringArray1[1]);
//		System.out.println("2nd index: " + myStringArray1[2]);
//
//		int len1 = myIntArray1.length;
//		int len2 = myStringArray1.length;
//		System.out.println("Int array length: " + len1);
//		System.out.println("Int String length: " + len2);
//
//		for (int i = 0; i < len1; i++) {
//			System.out.println(myIntArray1[i]);
//		}
//
//		Arrays.sort(myIntArray1);
//		for (int i = 0; i < len1; i++) {
//			System.out.println(myIntArray1[i]);    // print ascending order
//		}
			int[] numss={3 ,5};
		  System.out.println(frontPiece(numss));
		  frontPiece(numss);
	}
		public static int[] frontPiece(int[] nums) {
			  
			  if((nums.length)>=2){
			   return nums[0], nums[1]
			  }else if(nums.length==1){
			    int[] array={nums[0]};
			    return array;
			  }else{
			    int[]arr={};
			    return arr;
			  }}
			  
			  
		// System.arraycopy(src, srcPos, dest, destPos, length);
	}


