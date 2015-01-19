import java.util.Scanner;
public class _10_DozenEggs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int eggs = 0;
		int dozens = 0;
		
		for(int i = 0; i < 7; i++){
			String input = scan.nextLine();
			String[] array = input.split(" ");
			if(array[1].equals("eggs")){
				eggs = eggs + Integer.parseInt(array[0]);
			} else {
				dozens = dozens + Integer.parseInt(array[0]);
			}
		}
		
		while(eggs > 12){
			eggs = eggs - 12;
			dozens++;
		}
		
		System.out.printf("%d dozens + %d eggs", dozens, eggs);
	}
}
