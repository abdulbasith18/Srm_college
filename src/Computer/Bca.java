package Computer;

public class Bca {
 public static void main(String[]args) {
	 int a=121;
	 int original =a;
	 int i,j=0;
	 while(a>0) {
		 i=a%10;
		 j=(j*10)+i;
		 a=a/10;
	 }
	 System.out.println("The reverse of integer is "+j);
	 if(original==j) {
		 System.out.println("this is the palidrome");
		 
	 }
	 else {
		 System.out.println("this is not the palindrome");
	 }
 }
}
