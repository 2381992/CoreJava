package test;

import java.util.Scanner;

public class Primenumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,rem;
		System.out.println("Enter any number:");
		Scanner obj=new Scanner(System.in);
				num=obj.nextInt();
			for(int i=2;i<=num;i++) {
			rem = num%i;
			
			if(rem==0) {
				
				System.out.println("Num is not Prime");
				break;
			}
			
		
	if(rem!=0) {
			System.out.println("Num is Prime");
			break;
		}
			}
		

		
		
		
	}

}
