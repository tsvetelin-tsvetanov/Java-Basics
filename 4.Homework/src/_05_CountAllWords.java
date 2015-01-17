import java.util.Scanner;
public class _05_CountAllWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split("");
		int count = 1;
		
		for(int i = 0; i < array.length; i++){
			if(array[i].equals(" ") || array[i].equals("-") || array[i].equals("'")){
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
