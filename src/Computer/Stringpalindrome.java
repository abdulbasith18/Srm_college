package Computer;

public class Stringpalindrome {
	
	public static void main(String[]args) {
	String name = "malayalam";
	String reverse = "";
	
	for(int i=name.length()-1;i>=0;i--) {
		char a = name.charAt(i);
		reverse = reverse +a;
		
		
	}
	
	System.out.println(reverse);
	
	if(name.equals(reverse)) {
		System.out.println("this is palindrome");
	}
	else {
		System.out.println("this is not a palindrome");
	}
	
	}
	

}
