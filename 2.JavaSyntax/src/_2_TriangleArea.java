import java.util.Scanner;
public class _2_TriangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int xa = scan.nextInt();
		int ya = scan.nextInt();
		int xb = scan.nextInt();
		int yb = scan.nextInt();
		int xc = scan.nextInt();
		int yc = scan.nextInt();
		
		double area = Math.abs((xa*(yb - yc) + xb*(yc - ya) + xc*(ya - yb))/2);
		if(area > 0){
		System.out.println((int)area);
		}
		else{
			System.out.println("0");
		}
		scan.close();
	}
}
