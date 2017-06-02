package mooc;

public class ReverseSort {
	public String reverse(String str) {
		int len = str.length();
		String output = "";
		
		for(int i = len-1; i > -1; i--) {
			output += str.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		ReverseSort re = new ReverseSort();
		String str = "你好啊我不好";
		String output = re.reverse(str);
		System.out.println(output);
	}
}