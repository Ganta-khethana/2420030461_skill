package myproject1;
import java.util.*;
public class countnumbers {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	String str1[]=str.split(";");
	System.out.println(str1.length);
	char ch[]=str.toCharArray();
	System.out.println(ch.length);
}
}
