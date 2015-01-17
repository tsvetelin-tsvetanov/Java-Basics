import java.util.Scanner;
public class _02_SequencesOfEqualSrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split(" ");
		
		for(int i = 1; i < array.length; i++){
			if(array[i - 1].equals(array[i])){
				System.out.print(array[i] + " ");
			}
			else{
				System.out.print(array[i - 1]);
				System.out.println();
			}
			if(i == array.length - 1){
				System.out.println(array[i]);
			}
					
		}
		
		
		scan.close();
	}
}
