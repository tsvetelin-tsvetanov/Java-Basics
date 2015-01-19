import java.util.Scanner;
public class _11_AddingAngles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		int count = 0;
		int[] nums = new int[n];
		for(int a = 0; a < n; a++){
			nums[a] = scan.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				for(int k = j + 1; k < nums.length; k++){
						int a = nums[i];
						int b = nums[j];
						int c = nums[k];
						sum = a + b + c;
						if(sum % 360 == 0){
							System.out.printf("%d + %d + %d = %d degrees"
									, a, b, c, sum);
							count++;
							System.out.println();
						}
				}
			}
		}
		if(count == 0){
			System.out.println("No");
		}
		
	}
}
