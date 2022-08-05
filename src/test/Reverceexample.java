package test;

public class Reverceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Clean World Green World";
		
		String result = "";
		
		for(int index = str.length() -1 ; index>=0;index--) {
			
			char ch = str.charAt(index);
			result = result + ch;
			
		}
		
		System.out.println("The result string is " + result);
		

	}

}
