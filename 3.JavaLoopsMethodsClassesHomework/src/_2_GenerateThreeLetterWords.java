import java.util.Scanner;
import java.util.Arrays;
public class _2_GenerateThreeLetterWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] letters = input.split("");
		for(int a = 0; a < letters.length; a++){
			for(int b = 0; b < letters.length; b++){
				for(int c = 0; c < letters.length; c++){
					System.out.print(letters[a] + letters[b] + letters[c] + " ");
				}
			}
		}
		scan.close();
	}
}
		