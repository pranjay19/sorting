package sorting;
import java.util.*;
public class BubbleSort
{
	public static void bubbleSort(int arr[],int n)
	{
	    int j,k;
	    for (j=0;j<n-1;j++)
	    {
	        for (k=0;k<n-j-1;k++)
	        {
	            if (arr[k]>arr[k+1])
	            {
	                int temp = arr[k];
	                arr[k] = arr[k+1];
	                arr[k+1] = temp;
	            }
	        }
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
	    bubbleSort(arr,n);
	    System.out.println("\nThe sorted array is:");
	    for (int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    sc.close();
	}
}
