import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class _12_CardsFrequencies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split("[ ♥♣♦♠]+");
		Map<String, Integer> cardsMap = new LinkedHashMap<String, Integer>();
		for (String string : array) {
			Integer count = cardsMap.get(string);
			if(count == null){
				count = 0;
			}
			cardsMap.put(string, count + 1);
		}
		for (Map.Entry<String, Integer> entry : cardsMap.entrySet()) {
			double percentage = (double)entry.getValue() * 100 / array.length;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), percentage);
		}
	}
}
