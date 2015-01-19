import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class _04_OfficeStuff {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		LinkedHashMap<String, LinkedHashMap<String, Integer>> companies = 
				new LinkedHashMap<>();
		
		for(int i = 0; i < n; i++){
			String input = scan.nextLine();
			String[] array = input.split("[| - - |]");
			//System.out.println(array[1]);
			//System.out.println(array[4]);
			//System.out.println(array[7]);
			
			String name = array[1];
			Integer amount = Integer.parseInt(array[4]);
			String item = array[7];
			
			if(!companies.containsKey(name)){
				companies.put(name, new LinkedHashMap<String, Integer>());
			}
			LinkedHashMap<String, Integer> stuff = companies.get(name);
			int amountTemp = 0;
			if(stuff.containsKey(item)){
				amountTemp = stuff.get(item);
			}
			stuff.put(item, amount + amountTemp);

		}
		
		for (String company : companies.keySet()) {
			System.out.print(company + ": ");
			LinkedHashMap<String, Integer> stuff = companies.get(company);
			boolean isFirst = true;
			for (Map.Entry<String, Integer> oleole : stuff.entrySet()) {
				if(!isFirst){
					System.out.print(", ");
				}
				isFirst = false;
				String object = oleole.getKey();
				int amount = oleole.getValue();
				System.out.print(object + "-" + amount);
			}
			System.out.println();
		}
		
	}
}