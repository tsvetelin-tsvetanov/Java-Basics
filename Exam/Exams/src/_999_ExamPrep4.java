import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _999_ExamPrep4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
			nums[i] = Integer.parseInt(array[i]);
		}
		
		HashMap<String, Integer> couples = new HashMap<>();
		
		for(int i = 1; i < nums.length;i++){
			int a = nums[i - 1];
			int b = nums[i];
			String key = a + " " + b;
			Integer count = couples.get(key);
			if(count == null){
				count = 0;
			}
			count++;
			couples.put(key, count);
		}
		
		HashSet<String> couplesSet = new HashSet<>();
		
		for(int i = 1; i < nums.length; i++){
			int a = nums[i - 1];
			int b = nums[i];
			String key = a + " " + b;
			if(! couplesSet.contains(key)){
				int count = couples.get(key);
				float frequency = (float)count / (nums.length- 1);
				System.out.printf("%s -> %.2f%%\n", key, frequency * 100);
				couplesSet.add(key);
			}
		}
	}
}