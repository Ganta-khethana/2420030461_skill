package myproject1;
import java.util.*;
public class date_example {
public static void main(String args[]) {
	Date d=new Date();
	System.out.println("Current date is " +d);
	int month=d.getMonth();
	System.out.println("the month is "+month);
	int year=d.getYear();
	System.out.println("the year is "+year);
	System.out.println(d.getMinutes());
	System.out.println(d.getHours());
	System.out.println(d.getSeconds());
}
}
