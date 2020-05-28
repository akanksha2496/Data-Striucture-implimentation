import java.util.Scanner;

class Circular_Double_link_list
{

	public int size;
	Node start;
	class Node
	{
		int data;
		Node prev,next;
		Node()
		{
			prev=next=null;
		}
	}
	public void insert_beg(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			start=n;
			n.next=n;
			n.prev=n;
			++size;
			return;
		}
		start.prev.next=n;
		n.prev=start.prev;
		start.prev=n;
		n.next=start;
		start=n;
		++size;
		
		

	}

	public void insert_middle(int element, int pos) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(pos==1)
		{
			insert_beg(element);
		}
		else
		{
			Node ptr=start;
			while(--pos!=1)
			{
				ptr=ptr.next;
			}
			n.prev=ptr;
			n.next=ptr.next;
			ptr.next.prev=n;
			ptr.next=n;
			++size;
		}
		
	}

	public void insert_end(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			start=n;
			n.next=n;
			n.prev=n;
			++size;
			return;
		}
		n.next=start;
		start.prev.next=n;
		n.prev=start.prev;
		start.prev=n;
		++size;
		
		
	}

	public void delet_beg() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("no element to dlete\n");
		}
		else if(start.next==start)
		{
			start=null;--size;
		}
		else
		{
			start.next.prev=start.prev;
			start.prev.next=start.next;
			start=start.next;
			--size;
		}
		
	}

	public void delet_mid(int pos) {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(start==null)
		{
			System.out.println("nothing to delete\n");return;
		}
		if(pos==1)
		{
			delet_beg();
		}
		else
		{
			while(--pos!=0)
			{
				ptr=ptr.next;
			}
			ptr.prev.next=ptr.next;
			ptr.next.prev=ptr.prev;
			--size;
			
		}
	}

	public void delet_end() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("nothing to delete\n");return;
		}
		if(start.next==start)
		{
			start=null;
			--size;
			return;
		}
		else {
		start.prev.prev.next=start;
		start.prev=start.prev.prev;
		--size;}
		
	}

	public void display() {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(start==null)
		{
			System.out.println("empty list\n");
			return;
		}
		while(ptr.next!=start)
		{
			System.out.print(ptr.data+" ");ptr=ptr.next;
		}
		System.out.println(ptr.data);
		System.out.println("SIZE: "+size);
	}

	public void reverse() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("empty list\n");
			return;
		}
	  Node ptr=start,temp=null;
	  do {
		  temp=ptr;
		  Node t=ptr.next;
		  ptr.next=ptr.prev;
		  ptr.prev=t;
		  ptr=t;
		  
	  }while(ptr!=start);
	  start=temp;
		
		
	}
	
}

class Double_link_list
{

	int size;
	Node start;
	class Node
	{
		int data;
		Node prev,next;
		Node()
		{
			prev=null;next=null;
		}
	}

	public void insert_beg(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			start=n;++size;
		}
		else
		{
			start.prev=n;
			n.next=start;
			start=n;
			++size;
		}
		
	}

	public void insert_middle(int element, int pos) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		Node ptr=start;
		if(pos==1)
		{
			insert_beg(element);return;
		}
		while(--pos!=1)
		{
		  ptr=ptr.next;
		}
		n.prev=ptr;
		n.next=ptr.next;
		ptr.next.prev=n;
		ptr.next=n;
		++size;
		
		
		
	}

	public void insert_end(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		Node ptr=start;
		if(start==null)
		{
			start=n;++size;
		}
		else
		{
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			n.prev=ptr;
			ptr.next=n;
			++size;
		}
	}

	public void delet_beg() {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(start==null)
		{
			System.out.println("no element\n");
		}
		else if(start.next==null)
		{
			start=null;--size;
		}
		else {
		start=start.next;
		start.prev=null;
		--size;
		}
		
	}

	public void delet_mid(int pos) {
		// TODO Auto-generated method stub
		 Node ptr=start;
		 if(pos==1)
		 {
			 delet_beg();
		 }
		 else
		 {
			 while(--pos!=1)
			 {
				 ptr=ptr.next;
			 }
			 if(ptr.next.next==null)
			 {
				 delet_end();return;
			 }
			 ptr.next.next.prev=ptr;
			 ptr.next=ptr.next.next;
			 --size;
		 }
		
	}

	public void delet_end() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("no element\n");
		}
		else if(start.next==null)
		{
			start=null;--size;
		}
		else
		{
			Node ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.prev.next=null;
			--size;
		}
		
	}

	public void display() {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(start==null)
		{System.out.println("nothing to display\n");}
		else
		{
			while(ptr!=null)
			{
				System.out.print(ptr.data+" ");
				ptr=ptr.next;
			}
			System.out.println();
			System.out.println("size: "+size);
		}
		
		
	}

	public void reverse() {
		// TODO Auto-generated method stub
		Node ptr=start;
		Node prev=null;
		while(ptr!=null)
		{
			prev=ptr;
			Node temp=ptr.next;
			ptr.next=ptr.prev;
			ptr.prev=ptr.next;
			ptr=temp;
			
		}
		start=prev;
	}
	

}

class Circular_link_list
{
	Node start;
	int size;
	class Node
	{
		int data;
		Node link;
		Node()
		{
			link=null;
		}
	}
	public void insert_beg(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			
			start=n;
			start.link=start;
			size++;
			display();
			return;
		}
		Node ptr=start;
		while(ptr.link!=start)
		{ptr=ptr.link;}
		n.link=start;
		start=n;
		ptr.link=start;
		size++;
				
		
	}
	public void insert_middle(int element, int pos) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(pos==1)
		{
			insert_beg(element);
		}
		else
		{
			Node ptr=start;
			while(--pos!=1)
			{ptr=ptr.link;}
			if(ptr.link==start)
			{
				insert_end(element);return;
			}
				
			else
			{
				n.link=ptr.link;
				ptr.link=n;
				size++;
			}
			
			
			
		}
				
	}
	public void insert_end(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			
			start=n;
			start.link=start;
			size++;
			display();
			return;
		}
		Node ptr=start;
		while(ptr.link!=start)
			ptr=ptr.link;
		n.link=start;
		ptr.link=n;
		size++;
		
	}
	public void delet_beg() {
		
		Node ptr=start;
		if(start==null)
		{
			System.out.println("empty list");return;
		}
		else if(ptr.link==start)
		{
			start=null;--size;
		}
		else
		{
			
			System.out.print("delet_beg()\n");
			Node temp=start;
			while(ptr.link!=start)
			{
				ptr=ptr.link;
			}
			temp=temp.link;
			ptr.link=temp;
            start=temp;
			--size;
		}
		
	}
	public void delet_mid(int pos) {
		// TODO Auto-generated method stub
		if(pos==1)
		{
			delet_beg();return;
		}
		else 
		{
			Node ptr=start;
			while(--pos!=1)
			{
				ptr=ptr.link;
			}
			ptr.link=ptr.link.link;
			--size;
		}
		
	}
	public void delet_end() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("no element to delete\n");return;
		}
		else if(start==start.link)
		{
			start=null;--size;display();
		}
		else
		{
			System.out.print("delet_end() \n");
			Node ptr=start;
			while(ptr.link.link!=start)
			{
				System.out.print("ptr.data:"+ptr.data+" ");
				ptr=ptr.link;
			}
			System.out.println();
            ptr.link=start;
            --size;
            display();
		}
		
	}
	public void display() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("nothing to display");return;
		}
		Node ptr=start;
		while(ptr.link!=start)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.link;
		}
		System.out.print(ptr.data+" ");
		
		
		
	}
	public void reverse() {
		// TODO Auto-generated method stub
		Node cur,prev,next;
		cur=start.link;
        prev=next=start;		
		while(cur!=start)
		{
			System.out.println("i stuck!");
		    next=cur.link;
			cur.link=prev;
			prev=cur;
			cur=next;
		}
		cur.link=prev;
		start=prev;
	}

}

class Single_Link_list
{
	Node start;
	int size;
	class Node
	{
		int data;
		Node link;
		Node()
		{
			link=null;
		}
	}
	void display() {
		Node ptr=start;
		if(start==null)
		{
			System.out.println("nothing to display");
			return;
		}
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.link;
		}
		System.out.print("\n");
	}
     void insert_beg(int element) {
    	 Node n=new Node();
    	 n.data=element;
    	 if(start==null)
        {
    		 start=n;
    		 ++size;
    		 return;
        }
    	 else
    	 {
    		 n.link=start;
    		 start=n;
    		 ++size;
    		 
    	 }
    	 
		
	}
	public void insert_middle(int element, int pos) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			start=n;
			++size;
			return;
		}
		else
		{
			Node ptr=start;
			while(--pos!=1)
			{
				ptr=ptr.link;
			}
				n.link=ptr.link;
				ptr.link=n;	
				++size;
			
		}
	}
	public void insert_end(int element) {
		// TODO Auto-generated method stub
		Node n=new Node();
		n.data=element;
		if(start==null)
		{
			start=n;
			++size;
			return;
		}
		Node ptr=start;
		while(ptr.link!=null)
		{
			ptr=ptr.link;
		}
		ptr.link=n;
		++size;
	}
	public void delet_beg() {
		// TODO Auto-generated method stub
		if(start==null)
		{
			System.out.println("nothing to delete\n");
		}
		else if(start.link==start)
		{
			System.out.println("i am here u lost!");
			start=null;
			--size;
		}
		else
		{
			Node ptr=start;
			while(ptr.link!=start)
			{
				ptr=ptr.link;
			}
            ptr.link=start.link;
            start=start.link;
			--size;
		
		}
		
		
		
		
	}
	public void delet_mid( int pos) {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(pos==1)
		{
			delet_beg();
			return;
		}
		while(--pos!=1)
		{
			ptr=ptr.link;
			
		}
		--size;
		ptr.link=ptr.link.link;
	}
	public void delet_end() {
		// TODO Auto-generated method stub
		Node ptr=start;
		if(start==null)
		{
			System.out.println("nothing to delet\n");
		}
		else if(start.link==null)
		{
			start=null;--size;
		}
		else
		{
			while(ptr.link.link!=null)
			{
				ptr=ptr.link;
			}
			ptr.link=null;
			--size;
		}
		
	}
	public void reverse() {
		// TODO Auto-generated method stub
		Node next,cur,prev;
		next=prev=null;
		cur=start;
		while(cur!=null)
		{
			next=cur.link;
			cur.link=prev;
			prev=cur;
			cur=next;
			
		}
		start=prev;
	}
	
}
public class main {
	public static void main(String ar[])
	{
	 Scanner s=new Scanner(System.in);
	 int x;
	 int element,pos;
//	 call for single link list
//	 Single_Link_list l=new Single_Link_list();
//	 call for circular link list
//	 Circular_link_list l=new Circular_link_list();
//	 call for double link list
//	 Double_link_list l=new Double_link_list();
//	 call for double circular link list
	 Circular_Double_link_list l=new Circular_Double_link_list();
	 while(true)
	 {
		 System.out.print("\n choose an option\n1.insert begning\n2.insert middle\n3.insert end\n4.delete begining\n5.delete middle\n6.delete end\n7.display\n8.reverse\n9.exit\n");
		 x=s.nextInt();
		 
		 switch(x)
		 {
		 case 1:System.out.println("enter the element");
		 		element=s.nextInt();
		 		l.insert_beg(element);break;
		 case 2:System.out.println("enter the element");
	 		element=s.nextInt();
	 		System.out.println("enter the position(it will be start from 1");
	 		
	 		pos=s.nextInt();
	 		if(l.size>=pos-1) {l.insert_middle(element,pos);}
	 		else {System.out.println("position greater then size of list");}
	 		break;
		 case 3:System.out.println("enter the element");
	 		element=s.nextInt();
	 		l.insert_end(element);break;
		 case 4:l.delet_beg();break;
		 case 5:System.out.println("enter the position to be deleted\n");
		      pos=s.nextInt();
		      if(l.size>=pos) { l.delet_mid(pos);}else {System.out.println("position greater then size of list");}
			break;
		 case 6:l.delet_end();break;
		 case 7:l.display();break;
		 case 8:l.reverse();break;
		 case 9:System.exit(0);
		 default: System.out.print("\nwrong choice\n");
			 
		 }
	 }
	}
}
