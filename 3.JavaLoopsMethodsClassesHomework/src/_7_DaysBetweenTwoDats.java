import java.util.Scanner;
import java.time.LocalDateTime;
import java.text.ParseException;
import java.util.*;
import java.time.Duration;

public class _7_DaysBetweenTwoDats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] first = scan.nextLine().split("-");
		String[] second = scan.nextLine().split("-");
		
		LocalDateTime firstDate = LocalDateTime.of(Integer.parseInt(first[2]),
				Integer.parseInt(first[1]), Integer.parseInt(first[0]), 00, 00);
		LocalDateTime secondDate = LocalDateTime.of(Integer.parseInt(second[2]),
				Integer.parseInt(second[1]), Integer.parseInt(second[0]), 00, 00);
		
		Duration days = Duration.between(firstDate, secondDate);
		System.out.println(days.toDays());
				
	}
}
