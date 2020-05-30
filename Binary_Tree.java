import java.util.Scanner;

class Operations
{
	Node root;
	class Node
	{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;right=null;
			}
		

	}

	public void create() {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		Node n7=new Node(70);
		root=n1;
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;	
		
	}

	  void preorder(Node n) {
		// TODO Auto-generated method stub
		Node ptr=n;
		if(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			preorder(ptr.left);
			preorder(ptr.right);
			
			
		}
		
	}
       void inorder(Node n) {
		// TODO Auto-generated method stub
		Node ptr=n;
		if(ptr!=null)
		{
			
			inorder(ptr.left);
			System.out.print(ptr.data+" ");
			inorder(ptr.right);
		}
			
		}
		void postorder(Node n) {
			// TODO Auto-generated method stub
			Node ptr=n;
			if(ptr!=null)
			{
				
				postorder(ptr.left);
			
				postorder(ptr.right);
				System.out.print(ptr.data+" ");
				
				
			}
		
	}



		
		
}
class Binary_Tree
{
	public static void main(String ar[])
	{
		
		Scanner s=new Scanner(System.in);
		int c;
		Operations o=new Operations();
		int a[]= {40,30,0,23,82,90};
		while(true)
		{
			System.out.println("\n1.create BT\n2.pre oreder\n3.post order\n4.in order\nIn default case you will exit");
			c=s.nextInt();
			switch(c)
			{
			case 1:o.create();break;
			case 2:o.preorder(o.root);break;
			case 3:o.postorder(o.root);break;
			case 4:o.inorder(o.root);break;
	        default:System.exit(0);		
			}
		}
			
		
	}
	
}

