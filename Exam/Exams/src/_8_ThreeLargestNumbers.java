import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;

public class _8_ThreeLargestNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		BigDecimal[] nums = new BigDecimal[n];
		for (int i = 0; i < nums.length; i++) {
			String num = scan.nextLine();
			nums[i] = new BigDecimal(num);
		}
		Arrays.sort(nums);
		int count = 3;
		for(int i = nums.length - 1; i >= 0 && count > 0; i--, count --){
			System.out.println(nums[i]);
		}
		scan.close();
	}
}
