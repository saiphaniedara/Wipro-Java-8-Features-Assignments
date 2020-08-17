package com.wipro.parallelArraySort;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("Array before soting first 5 elements : ");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		Arrays.parallelSort(arr,0,5);
		System.out.println("\nArray after soting first 5 elements : ");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
	}

}
