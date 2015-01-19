
import java.util.Scanner;
public class _12_SumCards {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] cards = input.split(" ");
		int count = 1;
		int sum = 0;
		int previous = 0;
		for (String card : cards) {
			int value = cardValue(card);
			if(value == previous){
				count++;
			}
			else{
				count = 1;
			}
			sum = sum + value;
			if(count == 2){
				sum = sum + value * 2;
			}
			if(count > 2){
				sum = sum + value;
			}
			previous = value;
		}
		System.out.println(sum);
		scan.close();
		
	}
	private static int cardValue(String card){
		if(card.startsWith("2")) return 2;
		if(card.startsWith("3")) return 3;
		if (card.startsWith("4")) return 4;
		if (card.startsWith("5")) return 5;
		if (card.startsWith("6")) return 6;
		if (card.startsWith("7")) return 7;
		if (card.startsWith("8")) return 8;
		if (card.startsWith("9")) return 9;
		if (card.startsWith("10")) return 10;
		if (card.startsWith("J")) return 12;
		if (card.startsWith("Q")) return 13;
		if (card.startsWith("K")) return 14;
		if (card.startsWith("A")) return 15;
		throw new IllegalArgumentException("Invalid card: " + card);
	}
}
