import java.util.Scanner;
public class _06_CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String word = scan.nextLine();
		String[] texts = input.split("([().,!?:;'\"-]|\\s)+");
		int count = 0;
		
		for (String text : texts) {
			if(text.equalsIgnoreCase(word)){
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}
