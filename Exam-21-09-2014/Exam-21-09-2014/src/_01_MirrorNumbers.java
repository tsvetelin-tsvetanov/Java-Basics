import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class _01_MirrorNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		String[] array = input.split(" ");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		
		int count = 0;
		
		
		for(int i = 0; i < n; i++){
			String[] first = array[i].split("");
			a = Integer.parseInt(first[0]);
			b = Integer.parseInt(first[1]);
			c = Integer.parseInt(first[2]);
			d = Integer.parseInt(first[3]);
			for(int j = i + 1; j < n; j++){
				String[] second = array[j].split("");
				e = Integer.parseInt(second[0]);
				f = Integer.parseInt(second[1]);
				g = Integer.parseInt(second[2]);
				h = Integer.parseInt(second[3]);
				
					if(a == h && b == g && c == f && d == e){
						System.out.printf("%d%d%d%d<!>%d%d%d%d\n",
								a, b, c, d, e ,f ,g, h );
						count++;
					} else {}
			}
		}
		
		if(count == 0){
			System.out.println("No");
		}
	}
}
