import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class _11_MostFrequentWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String[] array = input.split("([().,!?:;'\"-]|\\s)+");
		
		Map<String, Integer> frequency = new TreeMap<String, Integer>();
		int maxCount = 0;
		for (String word : array) {
			Integer count = frequency.get(word);
			if(count == null){
				count = 0;
			}
			if(count + 1 > maxCount){
				maxCount = count + 1;
			}
			frequency.put(word, count + 1);
		}
		
		for (Map.Entry<String, Integer> max : frequency.entrySet()) {
			if(max.getValue() == maxCount){
				System.out.printf("%s -> %d times\n", max.getKey(), max.getValue());
			}
		}
	}
}
