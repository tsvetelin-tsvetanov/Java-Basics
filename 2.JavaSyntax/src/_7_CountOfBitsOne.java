import java.util.Scanner;
import java.util.Arrays;
public class _7_CountOfBitsOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while(n > 0){
			int bit = n & 1;
			if (bit == 1){
				count++;
			}
			n >>=1;
		}
		System.out.println(count);
		scan.close();
	}
}
