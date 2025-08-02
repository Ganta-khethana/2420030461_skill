package myproject1;
import java.util.*;
public class stringpalindrome {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	if(str.contentEquals(sb)) {
	System.out.println("string is a palindrome");
	}
	else {
		System.out.println("string is not a palindrome");
	}
	}
}
