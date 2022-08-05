package collections;

import java.util.LinkedList; 

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list1=new LinkedList<String>();//same as ArrayList but used for large number of data
		list1.add("Amrutha");//This have its own data and address of Madhu   
		list1.add("Madhu"); //This have its own data and address of Manu and so it called LinkedList 
		list1.add("Manu");
		list1.add("Pavi");
		list1.add("Chandu");
		
		System.out.println("List is this:"+list1);
		System.out.println("Size of Array List:"+list1.size());
		

	}

}
