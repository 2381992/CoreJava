package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Amrutha");
		list1.add("Madhu");
		list1.add("Manu");
		list1.add("Pavi");
		list1.add("Chandu");
		
		System.out.println("List is this:"+list1);
		System.out.println("Size of Array List:"+list1.size());
		
		/*ArrayList<Integer>list2=new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		System.out.println("List is this:"+list2);
		System.out.println("Size of Array List:"+list2.size());*/
		
		list1.remove(2);
		
		System.out.println("List is this:"+list1);
		System.out.println("Size of Array List:"+list1.size());
		
		System.out.println("The data at 3rd position:"+list1.get(3));
		
		list1.set(1, "Rashmi");//Replacing
		
		System.out.println("List is this:"+list1);
		System.out.println("Size of Array List:"+list1.size());
		
		list1.add(2, "Manu");
		
		System.out.println("List is this:"+list1);
		System.out.println("Size of Array List:"+list1.size());
		
		Collections.sort(list1);//Ascending order
		System.out.println("List is this:"+list1);
		
		Collections.reverse(list1);//Descending order
		System.out.println("List is this:"+list1);
		
		
		for(String Name:list1) {  //Using for each loop
			System.out.println(Name);
		}
		
		for(int i=0;i<list1.size();i++) {  //Using for loop
			if(list1.get(i)=="Chandu") {
				System.out.println(i);
				break;
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
