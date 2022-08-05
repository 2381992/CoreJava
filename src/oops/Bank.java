package oops;

public class Bank {
		int Acnum;
		public void Accoutnum() {
			System.out.println("The Account num:"+Acnum);
		
		}
		public int balance() {
			return 10000;
		}
		//Overriding Example
		public void CloseAccount() {
			System.out.println("The Closed account is:"+Acnum);
		}
		
		}
