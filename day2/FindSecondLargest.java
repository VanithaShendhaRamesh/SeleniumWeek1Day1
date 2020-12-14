package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int i= data.length-1; i>=0 ;i--) {
			System.out.println("Second Largest number " + data[data.length-2]);
	break;
		}
	}

}
