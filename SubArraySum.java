package arrays;

import java.util.ArrayList;

public class SubArraySum {

	public static void main(String[] args) {
		
		int n = 10;
		int s = 15;
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(SubArrSum(arr,n,s));

	}

	private static ArrayList<Integer> SubArrSum(int[] arr, int n, int s) {
		
		int start = 0;
		int last = 0;
		boolean flag = false;
		int currSum = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			currSum += arr[i];
			
			if(currSum >= s) {
				last = i;
				
				while(s < currSum) {
					currSum -= arr[start];
					++start;
				}
				
				if(currSum == s) {
					res.add(start + 1);
					res.add(last + 1);
					
					flag = true;
					break;
				}
			}
		}
		
		if(flag == false) {
			res.add(-1);
		}
		
		return res;
	}

}
