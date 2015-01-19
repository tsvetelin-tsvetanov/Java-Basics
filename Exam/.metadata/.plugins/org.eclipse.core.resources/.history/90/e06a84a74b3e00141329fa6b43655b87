import java.util.Scanner;
public class _13_StuckNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length; j++){
				for(int k = 0; k < nums.length; k++){
					for(int l = 0; l < nums.length; l++){
						int a = nums[i];
						int b = nums[j];
						int c = nums[k];
						int d = nums[l];
						if(a != b && a != c && a != d && b != c && b != d
								&& c != d){
							String one = "" + a + b;
							String two = "" + c + d;
							if(one.equals(two)){
								System.out.printf("%d|%d==%d|%d\n", a, b, c, d);
								count++;
							}
						}
							
					}
				}
			}
		}
		if(count == 0){
			System.out.println("No");
		}
	}
}
