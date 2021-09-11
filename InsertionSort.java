import java.util.*;
import java.lang.*;
public class InsertionSort
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("length of array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("elements of array");
		for(int i=0;i<n;i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}	
		for(int i=1;i<n;i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}