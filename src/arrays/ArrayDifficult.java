package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayDifficult {
	/*Given the array of integers containing equal number of even and odd numbers. Rearrange

	the array such that even number is at even place and odd number is at odd place.

	Example : [2,1,3,4,7,9,24,98]

	Answer : 1,2,3,4,7,24,9,98*/

	public static void main(String[] args) {
		int[] array={2,1,3,4,7,9,24,98};
		
		List<Integer> odd=new ArrayList<>();
		
		List<Integer> even=new ArrayList<>();
		
		for(int i=0; i<array.length;i++){
			if(array[i]%2>0){
				odd.add(array[i]); //1,3,7,9,
			}else{
				even.add(array[i]);//2,4,24,98
			}	
		}
		
		List<Integer> myList=new ArrayList<>();
		
		int x=0;
		int y=0;
		for(int j=1; j<=array.length;j++){
			if(j%2>0){
					
					myList.add(odd.get(x));
					x++;
				
			}else{
					
					myList.add(even.get(y));
					y++;
			}
		}
		
		for(Integer m : myList){
			System.out.print(m+",");
		}
	}
	
}
