import java.util.Scanner;
import java.util.Arrays;
public class _01_SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = scan.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		scan.close();
	}
}
