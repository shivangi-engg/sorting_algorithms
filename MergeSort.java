import java.util.*;
import java.lang.*;
public class MergeSort
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
		//call merge sort function to sort 
		MergeSort instance = new MergeSort();
		instance.mergeSort(arr,0,arr.length-1);
		printRes(arr);	
	}
	public static void mergeSort(int [] arr , int l,int h)
	{
		//check for atleast 2 elements
		if(l<h)
		{
			int mid = l+ (h-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr, mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	public static void merge(int [] arr,int l ,int mid,int h)
	{
		//length pf left and right subarrays
		int n1 = mid-l+1;
		int n2 = h-mid;
		//temp subarrays
		int []left = new int[n1];
		int []right = new int[n2];
		//enter values into temp arrays
		for(int a=0; a<n1;++a)
		{
			left[a]=arr[l+a];
		}
		for(int b=0; b<n2;++b)
		{
			right[b]=arr[mid+1+b];
		}

		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	public static void printRes(int [] arr)
	{
		System.out.println("sorted array:");
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
}