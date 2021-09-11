import java.util.*;
import java.lang.*;
public class SelectionSort
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
		for(int i=0;i<n;i++)
		{
			int min_ele = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[min_ele])
				{
					min_ele = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ele];
			arr[min_ele] = temp;
		}
		System.out.println("sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}