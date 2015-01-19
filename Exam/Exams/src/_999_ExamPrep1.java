import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class _999_ExamPrep1 {
	public static void main(String[] args) {
		//cognate words
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split("[^a-zA-Z]+"); 
		//google search non latin character
		int count = 0;
		
		HashSet<String> matches = new HashSet<>();
		
		for(int a = 0; a < words.length; a++){
			String wordA = words[a];
			for(int b  = 0; b < words.length; b++){
				String wordB = words[b];
				for(int c = 0; c < words.length; c++){
					String wordC = words[c];
					
					String leftSide = wordA + wordB;
					if(a != b && b != c && a != c){
						if(leftSide.equals(wordC)){
							String match = wordA+"|"+wordB+"="+wordC;
							if(!matches.contains(match)){
								matches.add(match);
								count++;
							}
						}
					}
				}
			}
		}
		for (String string : matches) {
			
		}
		if(count ==  0){
			System.out.println("No");
		}
	}
}
