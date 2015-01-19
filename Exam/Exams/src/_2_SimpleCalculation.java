import java.util.Scanner;
import java.math.BigDecimal;
public class _2_SimpleCalculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal x = scan.nextBigDecimal();
		BigDecimal y = scan.nextBigDecimal();
		if(x.compareTo(BigDecimal.ZERO) > 0 &&
				y.compareTo(BigDecimal.ZERO) > 0){
			System.out.println("1");
		}
		else if(x.compareTo(BigDecimal.ZERO) < 0 &&
				y.compareTo(BigDecimal.ZERO) > 0){
			System.out.println("2");
		}
		else if(x.compareTo(BigDecimal.ZERO) < 0 &&
				y.compareTo(BigDecimal.ZERO) < 0){
			System.out.println("3");
		}
		else if(x.compareTo(BigDecimal.ZERO) > 0 &&
				y.compareTo(BigDecimal.ZERO) < 0){
			System.out.println("4");
		}
		else if(x.compareTo(BigDecimal.ZERO) > 0 &&
				y.compareTo(BigDecimal.ZERO) == 0){
			System.out.println("6");
		}
		else if(x.compareTo(BigDecimal.ZERO) == 0 &&
				y.compareTo(BigDecimal.ZERO) < 0){
			System.out.println("5");
		}
		else if(x.compareTo(BigDecimal.ZERO) == 0 &&
				y.compareTo(BigDecimal.ZERO) == 0){
			System.out.println("0");
		}
		scan.close();
	}
}
