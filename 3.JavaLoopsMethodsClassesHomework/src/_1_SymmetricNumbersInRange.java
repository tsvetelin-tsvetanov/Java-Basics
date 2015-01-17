import java.util.Scanner;
public class _1_SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for(int i = start; i <= end; i++){
			if(i < 10){
				System.out.println(i);
			}
			else if(i > 9 && i < 100){
				int second = i % 10;
				int firstCheck = i / 10;
				int first = firstCheck % 10;
				if(first == second){
					System.out.println(i);
				}
			}
			else if(i > 100){
				int third = i % 10;
				int firstCheck = i / 100;
				int first = firstCheck % 10;
				if(first == third){
					System.out.println(i);
				}
			}
		}
		scan.close();
	}
}
