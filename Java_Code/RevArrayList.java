// Java program for reversing an arraylist 
import java.io.*; 
import java.util.*; 
class RevArrayList1 { 

	// Takes an arraylist as a parameter and returns 
	// a reversed arraylist 
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) 
	{ 
		// Arraylist for storing reversed elements 
		// this.revArrayList = alist; 
		for (int i = 0; i < alist.size() / 2; i++) { 
			Integer temp = alist.get(i); 
			alist.set(i, alist.get(alist.size() - i - 1)); 
			alist.set(alist.size() - i - 1, temp); 
		} 

		// Return the reversed arraylist 
		return alist; 
	} 

	// Iterate through all the elements and print 
	public void printElements(ArrayList<Integer> alist) 
	{ 
		for (int i = 0; i < alist.size(); i++) { 
			System.out.print(alist.get(i) + " "); 
		} 
	} 
} 

public class RevArrayList { 
	public static void main(String[] args) 
	{ 
		RevArrayList1 obj = new RevArrayList1(); 

		// Declaring arraylist without any initial size 
		ArrayList<Integer> arrayli = new ArrayList<Integer>(); 

		// Appending elements at the end of the list 
		arrayli.add(new Integer(12)); 
		arrayli.add(new Integer(13)); 
		arrayli.add(new Integer(123)); 
		arrayli.add(new Integer(54)); 
		arrayli.add(new Integer(1)); 
		System.out.print("Elements before reversing: "); 
		obj.printElements(arrayli); 
		arrayli = obj.reverseArrayList(arrayli); 
		System.out.print("\nElements after reversing: "); 
		obj.printElements(arrayli); 
	} 
} 
