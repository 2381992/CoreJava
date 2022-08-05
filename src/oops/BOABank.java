package oops;

public class BOABank extends Bank{
	int CCnum,CCbal;
	public void CCnumber() {
		System.out.println("The Credit card num:"+CCnum);
	}
	public void CCbalance() {
		System.out.println("The credit card Balance:"+CCbal);
		
	}
	//Over Riding Example
	public void CloseAccount() {
		System.out.println("The Closed account is:"+CCnum);
	}
	
	

}
