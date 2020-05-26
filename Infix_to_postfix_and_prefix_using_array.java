package stack_application_infix_to_postifx_and_prefix;

import java.util.Scanner;
 

class Infix_to_postfix{
	final int MAX=1000;
	String answer="";
	
	int top=-1;
	char[] stack=new char[MAX];
	int isdigit(char i)
	{
		switch(i)
		{
		case '^':return 3;
		case '*':
		case '/':return 2;
		case '+':
		case '-':return 1;
		default: return -1;
		}
	}
	void conversion(String a)                
	{
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='(')
			{
//				if(i==20)
//					
//				{	System.out.print("a.charAt(i)=='('");
//					break;
//				}
				stack[++top]=a.charAt(i);
				System.out.println("step:"+i+"\n");
				for(int i1=0;i1<=top;i1++)
				{System.out.print(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer);
			}
			else if(a.charAt(i)==')')
			{
//				if(i==20)
//				{	System.out.print("a.charAt(i)==')'"+"\n");
//					break;
//				}

				while(stack[top]!='(')
				{
					System.out.println("poped: "+stack[top]);
					answer+=stack[top--];
				}
				System.out.println("poped: "+stack[top]);
				stack[top]='\0'; 
				top--;
				System.out.println("step:"+i);
				for(int i1=0;i1<=top;i1++)
				{System.out.print(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer);
			}
			else if(isdigit(a.charAt(i))==-1)
			{
//				if(i==20)
//				{	System.out.println("step: "+i+"\n");
//					System.out.print("next digit: "+isdigit(a.charAt(i))+"\n");
//				     System.out.print("next expresion: "+a.charAt(i)+"\n");
//					System.out.print("(isdigit(a.charAt(i))==-1)"+"\n");
//					break;}
				
				answer+=a.charAt(i);
				System.out.println("step:"+i);
				for(int i1=0;i1<=top;i1++)
				{System.out.print(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer);
			}
			else if(isdigit(a.charAt(i))>-1 )
			{
//				if(i==20)
//				{	System.out.println("step: "+i+"\n");
//					System.out.print("next digit: "+isdigit(a.charAt(i))+"\n");
//				     System.out.print("next expresion: "+a.charAt(i)+"\n");
//					System.out.print("(isdigit(a.charAt(i))>-1)"+"\n");
//					}
				if(stack[top]=='(' || (isdigit(stack[top])<isdigit(a.charAt(i))) )
				{
					System.out.println("stack[top]: "+stack[top]);
				    System.out.println("isdigit(stack[top]): "+isdigit(stack[top]));
					stack[++top]=a.charAt(i);
					
				}
					
				else                              
				{
					
				while(isdigit(stack[top])>isdigit(a.charAt(i)) || stack[top]!='(')
				{
					 answer+=stack[top--];
				}
//				 answer+=stack[top];
				top++;
				 stack[top]=a.charAt(i);
				}
				System.out.println("step:"+i);
				for(int i1=0;i1<=top;i1++)
				{System.out.print(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer);
			}
			
		}
		for(int i=0;i<=top;i++)
		{System.out.print(stack[i]);}
		System.out.println();
		System.out.println(answer);
		System.out.println("_____________________________________________________________________");
		
	}
	
	
}
class Infix_to_prefix{

	Infix_to_postfix post=new Infix_to_postfix();
	final int MAX=1000;
	String answer="";
	int top=-1;
	char[] stack =new char[MAX];
	
	public void conversion(String a) {
		String new_a="";
		for(int i=a.length()-1;i>=0;i--)
		{
			new_a+=a.charAt(i);
		}
		System.out.println("Reversed expression is : "+new_a);
		
		for(int i=0;i<new_a.length();i++)
		{
			System.out.print("step: "+i+"\n");
			
			if(new_a.charAt(i)==')')
			{
//				if(i==3)
//				{
					System.out.println("new_a.charAt(i)==')'");
//					break;
//				}
				stack[++top]=new_a.charAt(i);
				for(int i1=0;i1<=top;i1++)
				{System.out.println(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer+"\n");
			}
				
			else if(new_a.charAt(i)=='(')
			{
//				if(i==3)
//				{
					System.out.println("new_a.charAt(i)=='('");
//					break;
//				}
				while(stack[top]!=')')
				{
					answer+=stack[top];
					top--;
				}
				top--;
				for(int i1=0;i1<=top;i1++)
				{System.out.println(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer+"\n");
				
				
			}
			else if(post.isdigit(new_a.charAt(i))==-1)
			{
//				if(i==3)
//				{
					System.out.println("new_a.charAt(i))==-1");
//					System.out.println(new_a.charAt(i));
//					break;
//				}
				answer+=new_a.charAt(i);
				for(int i1=0;i1<=top;i1++)
				{System.out.println(stack[i1]);}
				System.out.println();
				System.out.println("answer: "+answer+"\n");
				
			}
			else if(post.isdigit(new_a.charAt(i))>-1 )
			{
				
//				if(i==3)
//				{
					System.out.println("new_a.charAt(i))>-1 ");
//					break;
//				}
				if(stack[top]==')' || post.isdigit(stack[top])<=post.isdigit(new_a.charAt(i)))
				{
					System.out.println("i am stuck");
					stack[++top]=new_a.charAt(i);
					for(int i1=0;i1<=top;i1++)
					{System.out.println(stack[i1]);}
					System.out.println();
					System.out.println("answer: "+answer+"\n");
				}
				else
				{
					while(post.isdigit(stack[top])>post.isdigit(new_a.charAt(i)) || stack[top]!=')')
					{
						 answer+=stack[top--];
					}
//					 answer+=stack[top];
					top++;
					 stack[top]=a.charAt(i);
					 for(int i1=0;i1<=top;i1++)
						{System.out.println(stack[i1]);}
						System.out.println();
						System.out.println("answer: "+answer+"\n");
					
				}
					
			}
			
		}
		if(top>=0)
		{
			answer+=stack[top--];
		}
		String final_ans="";
		for(int i=answer.length()-1;i>=0;i--)
			 final_ans+=answer.charAt(i);
		System.out.println(final_ans);
		System.out.println("_____________________________________________________________________");
		
	}      
	
}

public class main {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Infix_to_postfix post =new Infix_to_postfix();
		Infix_to_prefix pre =new Infix_to_prefix();
		System.out.println("INFIX TO POSTFIX NOTATION");
		post.conversion(a);
		System.out.println("INFIX TO PREFIX NOTATION");
		pre.conversion(a);
		
	}

}
