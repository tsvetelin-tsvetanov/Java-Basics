import java.util.Scanner;
import java.math.BigInteger;
public class _3_SimpleLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		BigInteger c = scan.nextBigInteger();
		BigInteger result = new BigInteger("0");
		int n = scan.nextInt();
		
		for(int i = 3; i < n; i++){
			result = a.add(b);
			result = result.add(c);
			a = b;
			b = c;
			c = result;
		}
		System.out.println(c);
		scan.close();
	}
}
