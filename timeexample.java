package myproject1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class timeexample {
public static void main(String args[]) 
{
	LocalDate d=LocalDate.now();
	LocalDate d1=LocalDate.of(1999, 8, 1);
	System.out.println(d);
	System.out.println(d1);
	LocalTime now=LocalTime.now();
	System.out.println(now);
	LocalTime lt=LocalTime.of(9, 8);
	System.out.println(lt);
	LocalTime lt1=LocalTime.of(20, 7);
	System.out.println(lt1);
	
	LocalDateTime d2=LocalDateTime.now();
	LocalDateTime d3=LocalDateTime.of(2025, 8, 5, 23 , 59);
	System.out.println(d2);
	System.out.println(d3);
	
	Period p=Period.between(d, d1);
	System.out.println(p);
	
	Duration diff=Duration.between(lt,lt1);
	System.out.println(diff);
	System.out.println("Total Hours: "+ diff.toHours());
	System.out.println("Total Minutes: "+ diff.toMinutes());
	
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	System.out.println(dateTime.format(formatter));
}
}
