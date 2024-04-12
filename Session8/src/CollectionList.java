/* Name: Kowsya Mutkundu
 * Date: october 17, 2023
 * session 7
 * Purpose:  collection belongs to one type, import the in build program
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class CollectionList 
{
	public static void main (String[] args)
	{
		System.out.println("collection - arraylist implementation");
		
		//creating arraylist
		ArrayList<String> list= new ArrayList<String>();
		list.add("Tiger"); //adding object in arraylist
		list.add("Lion");
		list.add("dog");
		list.add("Elephant");
		
		//traversing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nCollection - LinkedList implementation");
		LinkedList<String> al=new LinkedList<String>();
		al.add("Rohit");
		al.add("ajay");
		al.add("nikhil");
		al.add("sanjan");
		Iterator<String> itrl= al.iterator();
		while(itrl.hasNext())
		{
			System.out.println(itrl.next());
		}
		System.out.println("\\nCollection - stack implementation");
		Stack<String> stack=new Stack<String>();
		stack.push("Toyota");
		stack.push("suxuki");
		stack.push("skoda");
		stack.push("nissan");
		stack.push("renault");
		stack.pop();
		Iterator<String> itr2= stack.iterator();	
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
