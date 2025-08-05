package myproject1;

public class immutability {
	  public static void main(String[] args) {
	          String s = "Hello";
	          s.concat(" World");
	          System.out.println(s); 
	          s = s.concat(" World");
	          System.out.println(s); 
	      
	  }
}
