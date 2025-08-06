package myproject1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class officetimings {
	public static void main(String args[]) {
		LocalTime start=LocalTime.of(9, 0);
		LocalTime ends=LocalTime.of(18, 0);
		
		LocalTime login=LocalTime.of(9, 15);
		LocalTime logout=LocalTime.of(17, 45);
		
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(dateTime.format(formatter));
		
		Duration d = Duration.between(login , logout );
		System.out.println(d);
		System.out.println("Total Hours: "+ d.toHours());
		System.out.println("Total Minutes: "+ d.toMinutes());
		
		

	}
}
