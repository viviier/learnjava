package mooc;

public class Initail {
	
	// 1
	public String name = "some hreo";
	
	// 3
	public Initail() {
		name = "one hero";
	}
	
	// 2
	{
		name = "two hero";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initail i = new Initail();
		System.out.println(i.name);
	}

}
