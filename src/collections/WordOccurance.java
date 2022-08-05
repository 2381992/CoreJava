package collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Clean World Love Self Green World Love World ";
		String []word = str1.split(" ");
		
		HashMap<String,Integer>map1 = new HashMap<String,Integer>();
		for(String x:word) {
			if(map1.get(x)==null) {
				map1.put(x, 1);
			}
			else{
				int oldoc=map1.get(x);
				map1.put(x, oldoc+1);
			}
		}
		System.out.println(map1);
		}
	}



