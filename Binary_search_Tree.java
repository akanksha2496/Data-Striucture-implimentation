
class Node
{
	int data;
	Node left;
	Node right;
	Node(int a)
	{
		data=a;
		left=null;
		right=null;
	}

}
class Create_BST
{
	Node root;

	public void insert_node(int a) {
		// TODO Auto-generated method stub
		Node n=new Node(a);
		if(root == null)
		{
			root=n;
			return;
		}
		Node ptr=root;
		search_insert(ptr,n); 
		inorder(root);
		System.out.println();
	
	}

	private void inorder(Node root2) {
		// TODO Auto-generated method stub
		if(root2!=null)
		{
			inorder(root2.left);
			System.out.print(root2.data+" ");
			inorder(root2.right);
		}
		
	}

	private void search_insert(Node ptr, Node n) {
		// TODO Auto-generated method stub
		  if(ptr.data>n.data)
		  {
			  if(ptr.left==null)
			  {
				  ptr.left=n;
			  }
			  else
			  {
				  search_insert(ptr.left,n);
			  }
		  }
		  else
		  {
			  if(ptr.right==null)
			  {
				  ptr.right=n;
			  }
			  else
			  {
				  search_insert(ptr.right,n);
			  } 
		  }
	}

	public void delete(int i) {
		// TODO Auto-generated method stub
		delete_this(i,root);
		inorder(root);
		System.out.println();
	}

	private Node delete_this(int i, Node root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			System.out.println("\nnothing to delete\n");
			return null;
		}
		else if(root.data>i)
		{
			root.left=delete_this(i,root.left);
		}
		else if(root.data<i)
		{
			root.right=delete_this(i,root.right);
		}
		else
		{
			if(root.right==null || root.left==null)
			{
				Node temp= (root.left==null)?root.right:root.left;
				if(temp==null)
				{
					return null;
				}
				else
				{
					return temp;
				}
				
			}
			else
			{
				Node ptr=sucessor(root);
				root.data=ptr.data;
//				ye doubt hora:
				root.right=delete_this(ptr.data,ptr);
			}
		}
		return root;
	}

	private Node sucessor(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return null;
		}
		Node ptr=root.right;
		while(ptr.left!=null)
		{
			ptr=ptr.left;
		}
		return ptr;
	}

	

	
}
public class Binary_search_Tree {

	
	public static void main(String ar[])
	{
		Create_BST c=new Create_BST();
		int[] a= {1,6,2,4,8,90,0};
		for(int i=0;i<a.length;i++)
			
		{
			c.insert_node(a[i]);
		}
		c.delete(0);
		c.delete(8);
		c.delete(6);
	}

}

