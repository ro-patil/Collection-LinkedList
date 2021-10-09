package LinkList;

public class MyLinkList
{
	Node root;
	void add(int num)
	{
		if(root==null)
			root=new Node(num);
		else
		{
			Node temp=root;
			while(true)
			{
				if(num==temp.num)
					break;
				else if(temp.next!=null)
					temp=temp.next;
				else if(temp.next==null)
					temp.next=new Node(num);
			}
		}
	}
	void print()
	{
		if(root!=null)
			printLinkList(root);
	}
	private void printLinkList(Node node) 
	{
		while(node!=null)
		{
			System.out.println(node.num);
			node=node.next;
		}
	}	
}