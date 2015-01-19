import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Arrays;
import java.security.KeyStore;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.RowFilter;

public class _999_ExamPrep3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<>();
		scan.nextLine();
		scan.nextLine();
		scan.nextLine();
		
		TreeMap<Integer, TreeMap<String,Double>> entrys = new TreeMap <>();
		
		while(true){
			String inputLine = scan.nextLine();
			
			if(inputLine.startsWith("-")){
				break;
			}
			
			String[] tokens = inputLine.split("[ |]+");
			System.out.println(Arrays.toString(tokens));
			
			String name = tokens[1] + " " + tokens[2];
			int score = Integer.parseInt(tokens[3]);
			String grade = tokens[4];
			
			String[] entries = new String[2];
			entries[0] = name;
			entries[1] = grade;
			
			if(!entrys.containsKey(score)){
				TreeMap<String, Double> newArray = new TreeMap<>();
				entrys.put(score, newArray);
			}  
			
			entrys.get(score).put(entries[0], Double.parseDouble(entries[1]));
			
		}
		
		
		for(Entry<Integer, TreeMap<String, Double>> entry : entrys.entrySet()){
			Double average = 0.0;
			int count = entry.getValue().entrySet().size();
			for(Entry<String, Double> subentry : entry.getValue().entrySet()){
				average = average + subentry.getValue();
				
			}
			for(Entry<String, Double> subentry : entry.getValue().entrySet()){
				
			}
			average = average / count;
			
			
		}
		
		
	}
}
