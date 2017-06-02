package how2j;

public class Stringfunc {
	String str = new String("abcdefg");
	
	// charAt
	char strCharat = str.charAt(5);
	
	// toCharArray
	char[] strChararray = str.toCharArray();
	
	// subString
	String strSubstring = str.substring(1);
	
	// split
	String[] strSplit = str.split(",");
	
	// trim
	String strTrim = str.trim();
	
	// toLowerCase
	String strTolowercase = str.toLowerCase();
	
	// toUpperCase
	String strTouppercase = str.toUpperCase();

	// indexOf
	int strIndexof = str.indexOf("a");
	
	// replaceAll
	String strReplaceall = str.replaceAll("a", "qwer");
}
