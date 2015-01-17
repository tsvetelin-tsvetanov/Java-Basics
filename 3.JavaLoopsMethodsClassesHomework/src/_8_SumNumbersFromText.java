import java.io.*;
import java.util.*;

public class _8_SumNumbersFromText {
	public static void main(String[] args) {
		BufferedReader scan;
		double sum = 0;
		
		try{
			scan = new BufferedReader(new FileReader("/src/InputNumbers.txt"));
			String line = null;
			while((line = scan.readLine()) != null){
				sum += Double.parseDouble(line);
			}
			scan.close();
			System.out.println(sum);
		} 
		catch(FileNotFoundException notFound){
			System.out.println("File not found");
		}
		catch(IOException err){
			System.out.println("Error" + err.getMessage());
		}
	}
}
