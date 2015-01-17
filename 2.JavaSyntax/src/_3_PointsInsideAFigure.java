import java.util.Scanner;
public class _3_PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		float y = scan.nextFloat();

		if(y >= 6 && y <13.6 && x >= 12.5 && x < 22.6){
			if(y > 8.5 && x > 17.5 && x < 20){
				System.out.println("outside");
			}
			else{
			System.out.println("inside");
			}
		}

		else{
			System.out.println("outside");
		}
		
		scan.close();
	}
}
