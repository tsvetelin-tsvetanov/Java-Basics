import java.util.Scanner;
import java.math.BigDecimal;

public class _14_SimpleExpression {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input.replace(" ", "");
		String[] numbers = input.split("[^0-9.]+");
		String[] operator = input.split("[0-9.]+");
		BigDecimal sum = new BigDecimal(numbers[0]);
		for(int i = 0; i < numbers.length; i++){
			BigDecimal number = new BigDecimal(numbers[i]);
			if(operator[i].equals("+")){
				sum = sum.add(number);
			}
			else if(operator[i].equals("-")){
				sum = sum.subtract(number);
			}
		}
		System.out.println(sum.toPlainString());
	}
}
