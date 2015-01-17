import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;



public class _03_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split(" ");
		Map<String, Integer> data = new TreeMap<String, Integer>();
		for (String string : array) {
			Integer count = data.get(string);
			if(count == null){
				count = 0;
			}
			data.put(string, count + 1);
		}
		
		Map.Entry<String, Integer> max = null;
		for (Map.Entry<String, Integer> entry : data.entrySet()) {
			if(max == null ||
					entry.getValue().compareTo(max.getValue()) > 0){
				max = entry;
			}
		}
		
		for(int i = 0; i < max.getValue(); i++){
			System.out.print(max.getKey() + " ");
		}
		scan.close();
	}
}