import java.util.Scanner;
public class _5_AngleUnitConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		String[] output = new String[n];
		for(int i = 0; i < n; i++){
			String[] input = scan.nextLine().split(" ");
			if(input[1].equals("deg")){
				double rad = degreesToRadians(Double.parseDouble(input[0]));
				output[i] = String.format("%.6f rad", rad);
			}
			else if(input[1].equals("rad")){
				double deg = radiansToDegrees(Double.parseDouble(input[0]));
				output[i] = String.format("%.6f deg", deg);
			}
		}
		for(String str : output){
			System.out.println(str);
		}
	}
	private static double degreesToRadians(double degrees){
		double radians = degrees * (Math.PI / 180.0);
		return radians;
	}
	private static double radiansToDegrees(double radians){
		double degrees = radians * (180.0 / Math.PI);
		return degrees;
		
	}
}


