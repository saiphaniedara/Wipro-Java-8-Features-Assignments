package com.wipro.parallelArraySort;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("Array before Sorting :");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		Arrays.parallelSort(arr);
		System.out.println("Array after Sorting :");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("\nSum of min and max value in the array = "+(arr[0]+arr[arr.length-1]));
	}

}
