import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class _08_ExtractEmails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Pattern emailPattern= Pattern.compile("[\\w-+]+(?:\\."
				+ "[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
		Matcher match = emailPattern.matcher(input);
		while(match.find()){
			System.out.println(match.group());
		}
		scan.close();
		
	}
}
