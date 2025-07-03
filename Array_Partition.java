package Greedy_Approach;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Partition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nums[]= new int[2*n];
		for(int i=0;i<2*n;i++) {
			nums[i]=sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; 
        }

        System.out.println(sum);
	}
}