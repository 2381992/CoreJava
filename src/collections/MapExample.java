package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String> ();
		map1.put(1, "Suma");
		map1.put(2, "Rama");
		map1.put(22, "Gowri");
		map1.put(41, "Tommy");
		map1.put(6, "Paru");
		map1.put(2, "Shiva"); //Replace Rama
		map1.put(76, "Suma");
		
		System.out.println(map1);
		System.out.println("The data on 41 position:"+map1.get(41));
		
		map1.remove(6);
		System.out.println(map1);
		
		for(int k:map1.keySet()) {
			System.out.println("The key :"+k);
			System.out.println("The Value :"+map1.get(k));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
