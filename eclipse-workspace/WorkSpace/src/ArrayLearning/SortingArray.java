package ArrayLearning;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int temp;
		int []nums= {21,32,12,3,1};
		for (int  i= 0; i < nums.length-1; i++) {
			for (int j = 0; j <nums.length-1-i; j++) //j <nums.length-1-i ----- Reduces j range
				{
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
