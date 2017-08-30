package book;

public class fourQuestion {

	public static double counton(double doedata) {
		double output = (double)(doedata * doedata);
		return output;
	}
	
	public static void main(String[] args) {
		double a = counton((double) 2);
		System.out.println(a);
	}

}
