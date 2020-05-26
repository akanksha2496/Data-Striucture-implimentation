import java.util.Scanner;

class Stack_linklist{
	Scanner s=new Scanner(System.in);
	class Node{
		int element;
		Node link;
	}
	Node top=null;
	void push(int x)
	{
		Node n=new Node();
		if(top==null)
		{
			n.element=x;
			n.link=null;
			top=n;
		}
		else
		{
			n.element=x;
			n.link=top;
			top=n;
		}
		display();
	}
	void display()
	{
		Node ptr=top;
		if(ptr==null)
		{System.out.println("no element to display");
		return;
		}
		else {
		while(ptr!=null)
		{
			System.out.print(ptr.element+" ");
			ptr=ptr.link;
		}
		}
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
			return;
		}
		int x=top.element;
		top=top.link;
		System.out.println("deleted element is :"+x+"\n");
		display();
	}
	int size()
	{
		int s=0;
	    Node ptr=top;
		while(ptr!=null)
		{
			s++;
			ptr=ptr.link;
		}
		return s; }
	void top_element()
	{
		if(top!=null)
			System.out.println(top.element);
		else
			System.out.println("nothing in stack\n");
	}
	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
}

public class main {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int x,total;
		
		
		Stack_linklist sl=new Stack_linklist();
		
		while(true)
		{
		System.out.println("enter ur choice to perform operation in stack:\n");
		System.out.println("1.push\n2.pop\n3.size of stack\n4.top element\n5.diplay\n6.isEmpty\n7.exit\n");	
		int c=s.nextInt();
		switch(c)
		{
		case 1:System.out.println("enter the total element u wanna push: \n");
		       total=s.nextInt();
		       while(total-->0) {
		       System.out.println("enter the elements\n");
			   x=s.nextInt();
		       sl.push(x);
		       }
		       break;
		case 2:System.out.println("enter the total element u wanna delete: \n");
		       total=s.nextInt();
	          while(total-->0) {
	        	System.out.println("enter the elements\n");
	        	sl.pop();
	       }
	       break;
		case 3:System.out.println(sl.size());break;
		case 4:sl.top_element();break;
		case 5:sl.display();break;
		case 6:System.out.println(sl.isEmpty());break;
		case 7:System.exit(0);
		default:System.out.print("wrong choice\n");break;
		};
		}
		
	}

}
