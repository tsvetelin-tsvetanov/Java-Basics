import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
import java.util.ArrayList;

public class _21_BiggestThreePrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[]array = input.split("[( )]+");
		TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < array.length; i++){
			if(!array[i].equals("")){
				int temp = Integer.parseInt(array[i]);
				numbers.add(temp);
			}
		}
		int primesCount = 0;
		int primesSum = 0;
		
		for (Integer integer : numbers) {
			if(integer <= 1 || primesCount == 3){
				break;
			}
			
			boolean isPrime = true;
			for(int i = 2; i < integer; i++){
				if(integer % i == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){
				primesSum = primesSum + integer;
				primesCount++;
			}
		}
		
		if(primesCount == 3){
			System.out.println(primesSum);
		} else {
			System.out.println("No");
		}
		
	}
}
