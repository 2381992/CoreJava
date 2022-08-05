package oops;

public class OverloadingExample {
	public int Area(int l,int b) {
		return l*b;
	}
	public int Area(int l) {
		return l*l;
	}
	public float Area(float l) {
		return l*l;
	}
	public double Area(double h,double l,double b ) {
		return h*l*b;
	}

}
