package sorting_all_types_with_array;

import java.util.Scanner;

class Bubble_sort
{
	final int MAX=5; 
	int[] array=new int[MAX];
	Scanner s=new Scanner(System.in);
	void display()
	{
		int i=0;
		while(i<MAX)
		{
			System.out.print(array[i]+" ");
			i++;
		}
		System.out.println();
	}
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX;i++)
		{
			array[i]=s.nextInt();
		}
		bubble_it();
		display();
	}
	private void bubble_it() {
		// TODO Auto-generated method stub
		int temp,flag=1;
		for(int i=0;i<array.length-1 && flag==1 ;i++)
		{
			flag=0;
			for(int j=0;j<array.length-i-1 ;j++)
			{
				System.out.print(i+" ");
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
				
			}
			System.out.println();
		}
		
	}
	}


class Selection_sort
{

	final int MAX=5; 
	int[] array=new int[MAX];
	Scanner s=new Scanner(System.in);
	void display()
	{
		int i=0;
		while(i<MAX)
		{
			System.out.print(array[i]+" ");
			i++;
		}
		System.out.println();
	}
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX;i++)
		{
			array[i]=s.nextInt();
		}
		select_it();
		display();
	}
	private void select_it() {
		// TODO Auto-generated method stub
		int min,index,temp;
		for(int i=0;i<array.length;i++)
		{
			min=array[i];index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<min)
				{
					index=j;
					min=array[j];
				}
			}
			if(i!=index)
			{
				temp=array[i];
				array[i]=array[index];
				array[index]=temp;
			}
		}
		
	}
	
}
class Insertion_sort
{
	final int MAX=5; 
	int[] array=new int[MAX];
	Scanner s=new Scanner(System.in);
	void display()
	{
		int i=0;
		while(i<MAX)
		{
			System.out.print(array[i]+" ");
			i++;
		}
		System.out.println();
	}
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX;i++)
		{
			array[i]=s.nextInt();
		}
		insertion();
		display();
	}
	private void insertion() {
		// TODO Auto-generated method stub
		int j,key;
		for(int i=1;i<array.length;i++)
		{
			
			key=array[i];
			for(j=i-1;j>=0 && array[j]>key;j--)
			{
				array[j+1]=array[j];
			}
			array[j+1]=key;
			display();
		}
		
	}

	}

class Merge_sort
{
	
	 Scanner s=new Scanner(System.in);
	 int[] a=new int[5];
	 
	 void start()
	 {
		 for(int i=0;i<5;i++)
			{
				a[i]=s.nextInt();
			}
		 sort(a,0,a.length-1);
		 display();
	 }

	public void sort(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r)
		{
			int q=(p+r)/2;
			sort(a,p,q);
			sort(a,q+1,r);
			System.out.println("p: "+p+"q: "+q+"r :"+r+"\n");
			merge(a,p,q,r);
			
		}
		
	}
	

	private void merge(int[] a, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1=q-p+1;
		int n2=r-q;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=a[p+i];
		for(int j=0;j<n2;j++)
			R[j]=a[q+1+j];
		int i=0,j=0,k=p;
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
			{
				a[k++]=L[i++];
			}
			else
			{
				a[k++]=R[j++];
			}
		}
		while(i<n1)
		{
			a[k++]=L[i++];
		}
		while(j<n2)
		{
			a[k++]=R[j++];
		}
		
	}
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}

class Quick_sort
{

	final int MAX=5;
	int[] a=new int[MAX];
	Scanner s=new Scanner(System.in);
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX;i++)
		{
			a[i]=s.nextInt();
		}
		QuickSort(a,0,a.length-1);
		display();

	}
	private void QuickSort(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		int q;
		if(p<r)
		{
			q=partition(a,p,r);
			QuickSort(a,p,q-1);
			QuickSort(a,q+1,r);	
			
			
		}
	}
	private int partition(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		int x=a[r];
		int i=p-1;
		for(int j=p;j<r;j++)
		{
			if(a[j]<x)
			{
				++i;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return i+1;
	}
	
}

class Counting_sort
{

	final int MAX=5;
	int[] a=new int[MAX];
	Scanner s=new Scanner(System.in);
	void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<MAX;i++)
		{
			a[i]=s.nextInt();
		}
		countingsort(a,0,a.length-1);
		display();

	}
	}

public class main {
  public static void main(String arr[])
  {
	  Scanner s=new Scanner(System.in);
	  int c;
	  Bubble_sort b=new Bubble_sort();
	  Selection_sort ss=new Selection_sort();
	  Insertion_sort is=new Insertion_sort();
	  Merge_sort ms=new Merge_sort();
	  Quick_sort qs=new Quick_sort();
	  while(true)
	  {
	    System.out.println("\n1.bubble sort\n2.selection sort\n3.Insertion sort\n4.Merge sort\n5.Quick Sort\n6.Exit\n"); 
        c=s.nextInt();
        switch(c)
        {
        case 1:b.sort();break;
        case 2:ss.sort();break;
        case 3:is.sort();break;
        case 4:ms.start();break;
        case 5:qs.sort();break;
        case 6:System.exit(0);
        default: System.out.println("wrong choice");
        }
	  }
	

  }
}
