import java.util.Scanner;
public class _7_PhytagoreanNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[]nums = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++){
			int temp = scan.nextInt();
			nums[i] = temp;
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					int a = nums[i];
					int b = nums[j];
					int c = nums[k];
					
					if(a <= b){
						if(a*a + b*b == c*c){
							System.out.printf("%d*%d + %d*%d = %d*%d\n", a, a
									, b, b, c, c);
							count++;
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
