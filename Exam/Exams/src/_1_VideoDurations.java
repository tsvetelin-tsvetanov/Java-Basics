import java.util.Scanner;
import java.util.Arrays;

import javax.swing.text.html.parser.ParserDelegator;
public class _1_VideoDurations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		
		while(true){
			String input = scan.nextLine();
			if(input.equals("End")){
				break;
			}
			String[]array = input.split(":");
			hours = hours + Integer.parseInt(array[0]);
			minutes = minutes + Integer.parseInt(array[1]);
		}
		
		while(minutes >= 60){
			minutes = minutes - 60;
			hours++;
		}
		System.out.printf(hours + ":%02d", minutes);
	}

}
