import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class _18_CouplesFrequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan. nextLine();
		String[] splitted = input.split(" ");
		int[] nums = new int[splitted.length];

		for(int i = 0; i < nums.length; i++){
			nums[i] = Integer.parseInt(splitted[i]);
		}
		
		HashMap<String, Integer> counts = new HashMap<>();
		for(int i = 1; i < nums.length; i++){
			int a = nums[i - 1];
			int b = nums[i];
			String key = a + " " + b;
			Integer count = counts.get(key);
			if(count == null){
				count = 0;
			}
			count++;
			counts.put(key, count);
		}
		
		HashSet<String> couples = new HashSet<>();
		for(int i = 1; i < nums.length; i++ ){
			int a = nums[i - 1];
			int b = nums[i];
			String key = a + " " + b;
			if(! couples.contains(key)){
				int count = counts.get(key);
				float frequency = (float)count / (nums.length - 1);
				System.out.printf("%s -> %.2f%%\n", key, frequency * 100);
				couples.add(key);
			}
		}
	}
}
