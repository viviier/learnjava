package how2j;

public class Stringbuffer {
	static StringBuffer str = new StringBuffer("a");
	
	public static void main(String[] args) {
		// append
		str.append("nihaoa");
		
		// delete
		str.delete(2, 4);
		
		// insert
		str.insert(1, "wudi");
		
		// reverse
		str.reverse();
		
		// length
		str.length();
	}
}
