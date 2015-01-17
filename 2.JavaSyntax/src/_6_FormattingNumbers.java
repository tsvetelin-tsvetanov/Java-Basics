import java.util.Scanner;
public class _6_FormattingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		String hexadecimal = Integer.toHexString(a).toUpperCase();
		String binary = Integer.toBinaryString(a);
		  while (binary.length() < 10) {    
		        binary = "0" + binary;
		  }
		
		System.out.print("|" + hexadecimal + "|" + binary + "|");
		System.out.printf("%10.2f |%-10.3f", b, c);
		scan.close();
	}
}
