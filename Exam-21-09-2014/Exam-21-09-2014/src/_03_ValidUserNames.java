
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class _03_ValidUserNames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split("[ /\\()]");
		
		List<String> names = new ArrayList();
		for(int i = 0; i < array.length; i++){
			String temp = array[i];
			if(temp.length() >= 3 && temp.length() <= 25){
				names.add(temp);
			}
		}
		
		int sum = 0;
		int biggestSum = 0;
		int a = 0;
		int b = 0;
		
		String[] finalNames = new String[2];

		for(int i = 1; i < names.size(); i++){
			String first = names.get(i - 1);
			String second = names.get(i);
			
			a = first.length();
			b = second.length();
			sum = a + b;
			if(sum > biggestSum){
				finalNames[0] = first;
				finalNames[1] = second;
				biggestSum = sum;
			}
			
		}
		
		System.out.println(finalNames[0]);
		System.out.println(finalNames[1]);
	}
}
