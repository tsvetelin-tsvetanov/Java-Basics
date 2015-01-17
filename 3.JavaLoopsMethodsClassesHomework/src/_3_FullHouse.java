import java.util.Scanner;
public class _3_FullHouse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] cards = new String[] {
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
		};
		String[] suits = new String[] {
				"♣", "♦", "♥", "♠"	
		};
		
		int count = 0;
		
		for(int a = 0; a < cards.length; a++){
			for(int b = 0; b < cards.length; b++){
				if(a != b){
					for(int c = 0; c < 4; c++){
						for(int d = 0; d < 4; d++){
							for(int e = 0; e < 4; e++){
								for(int f = 0; f < 4; f++){
									for(int g = 0; g < 4; g++){
										if(c != d && c != e && d != e && f != g){
										System.out
										.printf("(%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s)",
											cards[a], cards[d], suits[c], suits[d], suits[e],
											suits[f], suits[g]
											);
										count++;
										System.out
											.println();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("\n%d full houses", count);
		scan.close();
	}
}
