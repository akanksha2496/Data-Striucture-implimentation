import java.util.Scanner;

class Circular_queue
{
	final int MAX=5;
	int size=0;
	int[] queue=new int[MAX];
	int front=-1,rear=-1;
	void display()
	{
		if(IsEmpty())
		{
			System.out.print(" nothing to display\n");
			return;
		}
		else if(front==rear)
		{
		 		System.out.println(queue[front]);
		}
		else
		{
			int i=front;
			while(i!=rear)
			{
				System.out.print(queue[i]+" ");
				i=(i+1)%MAX;
			}
			System.out.print(queue[i]+" ");
			System.out.println();
		}
		
	}
	void dequeue() {
		// TODO Auto-generated method stub
		if(IsEmpty())
		{
			System.out.println("queue is empty");
			return;
		}
		else if(front==rear)
		{
			int del=queue[front];
			System.out.println("deleted element is: "+del);
			front=-1;
			size--;
		}
		else
		{
			int del=queue[front];
			System.out.println("deleted element is: "+del);
			front=(front+1)%MAX;
			size--;
		}
		
	}
    void queue_size() {
				// TODO Auto-generated method stub
//    	if(front==-1)
//    		System.out.print(0+"\n");
//    	else
    		System.out.print(size+"\n");
		
	}
	boolean isFullQueue() {
		// TODO Auto-generated method stub
		if(front==(rear+1)%MAX)
			return true;
		else
			return false;
	}
	boolean IsEmpty() {
		// TODO Auto-generated method stub
		if(front==-1)
			return true; 
		else
			return false;
	}
	void enqueue(int element) {
		// TODO Auto-generated method stub
		if(isFullQueue())
		{
			System.out.print("Empty queue\n");
			return;
		}
		else 		
		{ 
			rear=(rear+1)%MAX;
			queue[rear]=element;
			size++;
			if(front==-1)
				front=0;
			
		}
	
		
	}
	

}

class Queue
{
	final int MAX=5;
	int[] queue=new int[MAX];
	int front=-1,rear=-1;
	void display()
	{
		if(front==-1)
		{
			System.out.print(" nothing to display\n");
			return;
		}
		int x=front;
		System.out.print("queueu elements are:\n");
		while(x<=rear)
		{
			System.out.println(queue[x]+"\n");
			x++;
		}
	}
	
	void enqueue(int x)
	{
		if(rear==MAX-1)
		{
			System.out.print("queue is full\n");
			return;
		}
		queue[++rear]=x;
		if(front==-1)
			front=0;
		display();
	}

	void dequeue() {
		if(front==-1)
		{
			System.out.print("queue is empty\n");return;
		}
		else if(front==rear)
		{
			System.out.print("deleted element is: "+queue[front]+"\n");
			front=rear=-1;
		}
		else
		{
			int del=queue[front];
			++front;
			System.out.print("deleted element is: "+del+"\n");
		}
		display();
	}

	public void queue_size() {
		// TODO Auto-generated method stub
		if(front==-1)
		{System.out.println("size is: 0\n");return;}
		else
		System.out.println("size is: "+(rear-front+1)+"\n");
	}

	boolean IsEmpty() {
		// TODO Auto-generated method stub
		if(front==-1)
			return true;
		else
			return false;
	}

	boolean isFullQueue() {
		// TODO Auto-generated method stub
		if(rear==MAX-1)
		return true;
		else 
			return false;
	}
	
	
	}
public class main {
	
	
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
//		Normal queue
//		Queue q=new Queue();
//		Circular queue;
		Circular_queue q=new Circular_queue();
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
