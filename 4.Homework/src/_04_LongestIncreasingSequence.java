import java.util.Scanner;
import java.util.ArrayList;

public class _04_LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[]array = input.split(" ");
		int[] nums = new int[array.length]; 
		
		for(int i = 0; i < array.length; i++){
			nums[i] = Integer.parseInt(array[i]);
		}
		
		ArrayList<ArrayList<Integer>> sequences = new ArrayList<>();
		ArrayList<Integer> sequence = new ArrayList<>();
		sequence.add(nums[0]);
		
		for(int i = 1; i < nums.length; i++){
			if(nums[i] > nums[i - 1]){
				sequence.add(nums[i]);
			} else {
				sequences.add(sequence);
				sequence = new ArrayList<>();
				sequence.add(nums[i]);
			}
		}
		
		sequences.add(sequence);
		
		for (ArrayList<Integer> seq : sequences) {
			for (Integer integer : seq) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
		
		ArrayList<Integer> longest = new ArrayList<>();
		longest = sequences.get(0);
		for(int i = 1; i < sequences.size(); i++){
			if(sequences.get(i).size() >sequences.get(i - 1).size()){
				longest = sequences.get(i);
			}

		}
		
		System.out.print("Longest: ");
		for (Integer integer : longest) {
			System.out.print(integer + " ");
		}
		scan.close();
	}
}
