import java.util.Scanner;
import java.util.Random;

public class _6_RandomHandOfFiveCards {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
        String[] suits = {"♣", "♦", "♥", "♠" }; 
        
        Random rnd = new Random();
        for(int i = 0; i < n; i++){
            System.out.printf("%s%s %s%s %s%s %s%s %s%s%n",
            		cards[rnd.nextInt(13)], suits[rnd.nextInt(4)],
            		cards[rnd.nextInt(13)], suits[rnd.nextInt(4)],
            		cards[rnd.nextInt(13)], suits[rnd.nextInt(4)],
            		cards[rnd.nextInt(13)], suits[rnd.nextInt(4)],
            		cards[rnd.nextInt(13)], suits[rnd.nextInt(4)]);
        }
		scan.close();
	}
}
