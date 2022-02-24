package sorting;

import java.util.*;
public class NewSort
{
	public static void selectionSort(int arr[],int n)
	{
		int pos;
		int temp;
		for (int i=0;i<n;i++)
		{
			pos = i;
			for (int j=i+1;j<n;j++)
			{
				if (arr[j]<arr[pos])
				{
					pos = j;
				}
			}
			temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array - ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements that will be sorted:");
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter a number - ");
			arr[i] = sc.nextInt();
		}
	    selectionSort(arr,n);
	    System.out.println("\nThe sorted array is:");
	    for (int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    sc.close();
	}
}
