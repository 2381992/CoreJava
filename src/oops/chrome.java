package oops;

public class chrome extends Browser{

	@Override
	public void openbrowser() {
		// TODO Auto-generated method stub
		System.out.println("Opened");
		
	}

	@Override
	public void closebrowser() {
		// TODO Auto-generated method stub
		System.out.println("Closed");
		
	}
	public void history() {
		System.out.println("History cleared");
	}

}
