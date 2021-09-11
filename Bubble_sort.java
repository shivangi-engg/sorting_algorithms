import java.util.*;
import java.lang.*;
public class Bubble_sort
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
		boolean swapped = false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
			{
				break;
			}
		}
		System.out.println("sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}