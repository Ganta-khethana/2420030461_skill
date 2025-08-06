package myproject1;
import java.time.*;
import java.util.Scanner;
public class age {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter year: ");
    int year = sc.nextInt();
    System.out.print("Enter month: ");
    int month = sc.nextInt();
    System.out.print("Enter day: ");
    int day = sc.nextInt();
    LocalDate d=LocalDate.now();
	LocalDate d1=LocalDate.of(year, month , day);
	System.out.println(d);
	System.out.println(d1);
	Period age=Period.between(d, d1);
	System.out.println(age);
	System.out.println("Year" + age.getYears());
	System.out.println("Month" + age.getMonths());
	System.out.println("Day" + age.getDays());
}
}
