import java.util.Scanner;
import java.util.Arrays;
public class _8_SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        String[] cities = new String[n];
        for(int i=0;i<n;i++)
        {
        	cities[i] = scan.next();
        }
        Arrays.sort(cities);
        for(int i=0;i<n;i++)
        {
                System.out.println(cities[i]);
        }
	}
}
