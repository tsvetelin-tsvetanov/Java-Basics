import java.util.Scanner;
public class _5_DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int decimal = scan.nextInt();
		
		String hexadecimal = Integer.toHexString(decimal).toUpperCase();
		System.out.println(hexadecimal);
		
		scan.close();
	}
}
