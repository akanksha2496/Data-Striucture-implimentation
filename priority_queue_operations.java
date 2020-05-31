package priority_queue;

import java.util.Scanner;

class Heap
{
	int MAX=100;
	int a[];
	int size;
    public Heap() {

        a = new int[MAX];

        size = 0;

  }
    
	public void build_heap() {
		// TODO Auto-generated method stub
		for(int i=(size-1)/2;i>=0;i--)
		{
			Heapify(i);
		}
		display();
		
	}

	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private void Heapify(int i) {
		// TODO Auto-generated method stub
		int l=2*i,r=2*i+1,max;
		if(l<size && a[l]>a[i] )
		{
			max=l;
		}
		else
		{
			max=i;
		}
		if(r<size && a[r]>a[max])
		{
			max=r;
		}
		if(max!=i)
		{
			
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
			Heapify(max);
		}
		
			
	}

	public int extractmax() {
		// TODO Auto-generated method stub
		int max=a[0];
		int x=size-1;
		a[0]=a[x];
		size=size-1;
		Heapify(0);
		display();
		System.out.println();
		return max;
		
	}

	public int extractmin() {
		// TODO Auto-generated method stub
		int min=1000,index=0,flag=0;
		for(int i=(int) (Math.ceil(size/2)-1);i<size;i++)
		{
			if(a[i]<min)
			{
				min=a[i];index=i;flag=1;
			}
		}
		if(flag==1)
		{
			display();
			System.out.println();
			int temp=a[size-1];
			a[size-1]=a[index];
			a[index]=temp;
			System.out.println(a[size-1]+"\n ");
			--size;
			Heapify(0);
			display();
			System.out.println();
		}
		
		return min;
	}

	public void heapSort() {
		// TODO Auto-generated method stub
		for(int i=size-1;i>=0;i--)
		{
			int temp=a[0]; 
			a[0]=a[i];
			a[i]=temp;
			size--;
			Heapify(0);
		}	
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}

	public void initialisearray() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			size++;
		}
		
		
	}

	public void insert(int i) {
		// TODO Auto-generated method stub
		
		a[size]=i;
		System.out.println(size+"\n");
		++size;
//		System.out.println("\n"+size+"\n");
		int j=size-1;
//		build_heap();
		while(j>=0 && a[(int) Math.ceil((j-1)/2)]<a[j] )
		{
			int temp=a[(int) Math.ceil((j-1)/2)];
			a[(int) Math.ceil((j-1)/2)]=a[j];
			a[j]=temp;
			j=(int) Math.ceil((j-1)/2);
		}
	    display();
	}

	
	
}
public class priority_queue_operations {
	public static void main(String ar[])
	{
		Heap h=new Heap();
		System.out.println("\ninsert element in empty array\n");
		h.initialisearray();
		System.out.println("\nBUILD HEAP\n");
		
		h.build_heap();
		System.out.println("\nextract max from max heap\n");
		System.out.println(h.extractmax());
		System.out.println("\nextract min from max heap\n");
		System.out.println( h.extractmin());
//		System.out.println("\nHeap SORT\n");
//        h.heapSort();
		System.out.println("heap insert-20");
		h.insert(20);
        h.insert(0);
	}

}
