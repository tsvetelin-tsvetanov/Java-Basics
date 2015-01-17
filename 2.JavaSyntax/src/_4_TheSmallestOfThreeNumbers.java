import java.util.Scanner;
public class _4_TheSmallestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if(a < b && a < c){
			System.out.println(a);
		}
		else if(b < a && b < c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
		scan.close();
	}
}
