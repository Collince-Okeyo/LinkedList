public class LinkedList
{
	private Node first;
	
	public LinkedList()
	{
		first=null;
	}
	public boolean isEmpty()
	{
		if(first==null)
			return true;
		else
			return false;
	}
	public void insertAtStart(String e)
	{
		Node temp=new Node();
		temp.setData(e);
		temp.setNext(first);
		first=temp;
	}
	public void traverse()
	{
		if(first==null)
		{
			System.out.println("list is empty ");
		}
		else
		{
		System.out.println("Traversed elements are: ");
		 Node ptr=first;
		while(ptr!=null)
		{
				System.out.println(ptr.data);
					ptr=ptr.next;
		}
		}
	}	
	public void deleteAtStart()
	{
		if(first==null){
			System.out.println("list is empty");
		}
		else{
			
			Node temp;
			 temp=first;
			 	first=first.getNext();
			temp.setNext(null);
			 
		}
	}
	
}
