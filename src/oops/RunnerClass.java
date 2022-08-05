package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee("Neon",3456,"HR");
		E1.Display();
		
		Employee E2=new Employee();
		E2.Name = "Ravi";
		E2.EmpId = 1234;
		E2.Department = "Manager";
		E2.Display();
		
		//Inheritance Example
		
		BOABank o = new BOABank();//Calling from Child class
		o.Acnum = 123456789;
		o.Accoutnum();
		
		System.out.println("The balance is:"+ o.balance() );
		
		o.CCnum= 22334455;
		o.CCnumber();
		o.CCbal = 3000;
		o.CCbalance();
		
		Bank o1= new Bank();//Calling from Parent class
		o1.Acnum = 123456789;
		o1.Accoutnum();
		System.out.println("The balance is:"+ o1.balance() );
		
		
		// Overloading Example
		
		OverloadingExample a = new OverloadingExample();
		int p= a.Area(4, 3);
		System.out.println("Area of rectangle:"+p);
		System.out.println("Area of Square:"+a.Area(5));
		System.out.println("Area of Square:"+a.Area(5.32f));
		double q=a.Area(0.5, 3.6, 6.1);
		System.out.println("Area of Triangle:"+q);
		
		//Overriding Example
		
		o1.CloseAccount();
		o.CloseAccount();
		
		//Abstract Example
		//Browser Br=new Browser(); [can not initiate abstracted class]
		chrome ch=new chrome();
		ch.openbrowser();
		ch.closebrowser();
		ch.Display();
		ch.history();
		
		Browser Br=new chrome();
		Br.openbrowser();
		Br.closebrowser();
		Br.Display();
		
		// Interface Example
		
		carinterface car= new Honda();
		car.start();
		car.stop();
		
		Honda car1= new Honda();
		car1.start();
		car1.stop();
		
		//Encapsulation Example
		
		Encapsulation En = new Encapsulation();
		En.setBalance(45366);
		System.out.println(En.getBalance());
		En.setName("Murthi");
		System.out.println(En.getName());
		En.setAddress("Mysore");
		System.out.println(En.getAddress());
		
		


	}




}
