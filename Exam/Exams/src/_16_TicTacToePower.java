import java.util.Scanner;
import javax.swing.*;

public class _16_TicTacToePower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int n = scan.nextInt();
		Double result = new Double(0);
		long print = 0;
		
		int a = n;
		int b = n + 1;
		int c = n + 2;
		int d = n + 3;
		int e = n + 4;
		int f = n + 5;
		int g = n + 6;
		int h = n + 7;
		int i = n + 8;
		
		int index = 0;
		if(x == 0 && y == 0){
			index = 1;
			result = Math.pow(a, index);
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 1 && y == 0){
			index = 2;
			result = (Math.pow(b, index));
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 2 && y == 0){
			index = 3;
			result = Math.pow(c, index);
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 0 && y == 1){
			index = 4;
			result = (Math.pow(d, index));
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 1 && y == 1){
			index = 5;
			result = Math.pow(e, index);
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 2 && y == 1){
			index = 6;
			result = Math.pow(f, index);
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 0 && y == 2){
			index = 7;
			result = (Math.pow(g, index));
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 1 && y == 2){
			index = 8;
			result = (Math.pow(h, index));
			print = result.longValue();
			System.out.println(print);
		}
		else if(x == 2 && y == 2){
			index = 9;
			result = (Math.pow(i, index));
			print = result.longValue();
			System.out.println(print);
		}
	}
}
