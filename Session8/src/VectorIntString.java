/* Name: Kowsya Mutkundu
 * Date: october 17, 2023
 * session 7
 * Purpose:  vector and collection
 */
import java.util.Vector;
public class VectorIntString 
{
	public static void main(String[] args)
	{
		//create an empty vector, vector is dynamic no fix size
		Vector<Integer> in = new Vector<> ();
		//Vector<Double> in = new Vector<> ();
		//add elements in the vector
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		//display the vector elements
		System.out.println("values in vector:" + in);
		
		//use remove() method to delete the first occurence of an element
		System.out.println("remove first occurence of element 200:" +in.remove((Integer)200));
		
		//display the vector elements after remove()method	
		System.out.println("values in vector :" +in);
		
		//remove the element at index 4
		System.out.println(" remove element at index 4:" +in.remove(4));
		System.out.println(" new value list in vector" +in);	
		
		//remove an element
		in.removeElementAt(5);
		
		//checking vector and display elements
		System.out.println("vector element after removal:" +in);
		
		//get the element at specified index
		System.out.println("element at index 1 is - " + in.get(1));
		
		
		Vector<String> vec= new Vector<String>();
		//adding elements using add() method list
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("dog");
		vec.add("Elephant");
        //adding elements using addElement() method of Vector
        vec.addElement("rat");
        vec.addElement("cat");
        vec.addElement("deer");
        System.out.println("elements are:" + vec);
	}

}
