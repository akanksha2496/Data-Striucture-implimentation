package queue_using_linklist;

import java.util.Scanner;

class Queue
{
	int size=0;
	 final int MAX=5;
	class Node
	{
		int data;
		Node link;
	}
	Node front=null,rear=null;
	
	public void enqueue(int element) {
		// TODO Auto-generated method stub
		if(isFullQueue())
		{
			System.out.print("queue is  full\n");
			return;
		}
		Node n=new Node();
		n.data=element;
		n.link=null;
		if(front==null)
		{
			front=n;
			rear=n;
			size++;
		}
		else 
		{
			Node ptr=front;
			while(ptr.link!=null)
			{ptr=ptr.link;}
			ptr.link=n;
			rear=n;
			size++;
		}
		
	}

	public void dequeue() {
		// TODO Auto-generated method stub
		if(IsEmpty())
		{
			System.out.println("enmpty queue");
			return;
		}
		else if(front==rear)
		{
			int dele=front.data;
			System.out.println("deleted item is : "+dele);
			front=rear=null;
			size--;
		}
		else
		{
			int dele=front.data;
			System.out.println("deleted item is : "+dele);
			front=front.link;
			size--;
		}
	}

	public void queue_size() {
		// TODO Auto-generated method stub
//		Node ptr=front;
//		int c=0;
//		while(ptr!=null)
//		{
//			++c;ptr=ptr.link;
//		}
		System.out.print("size is: "+size);
	}

	boolean IsEmpty() {
		// TODO Auto-generated method stub
		if(size==0)
			return true;
		else
		    return false;
	}

	boolean isFullQueue() {
		// TODO Auto-generated method stub
		if(size==MAX)
			return true;
		else
			return false;
	}

	public void display() {
		// TODO Auto-generated method stub
		Node ptr=front;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.link;
		}
		
	}
	
	}

public class main {
	
	
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		Queue q=new Queue();
		int c,n;
		int element;
		while(true)
		{
			System.out.println("\nenter ur choice");
			System.out.println("\n1.enque\n2.deque\n3.queue_size\n4.IsEmptyQueueu\n5.IsFullQueue\n6.display\n7.Exit\n");
			c=s.nextInt();
			switch(c)
			{
			case 1:System.out.print("total number of element to be inserted:\n");
			         n=s.nextInt();
			         while(n-->0)
			         {
			        	 element=s.nextInt();
			        	 q.enqueue(element);			        	 
			         }
			         break;
				      					 
			case 2:System.out.print("total number of element to be deleted:\n");
						n=s.nextInt();
						while(n-->0)
						{
						q.dequeue();
						}
						break;
			case  3:q.queue_size();break;
			case 4:System.out.print(q.IsEmpty());break;
			case 5:System.out.print(q.isFullQueue());break;
			case 6:q.display();break;
			case 7:System.exit(0);
			
			default :
				System.out.println("wrong choice choose correct one");
			
			}

			
		}
	}

}
