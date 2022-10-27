import java.util.Scanner;

public class BitPP_282A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nOpr = sc.nextInt();
		sc.nextLine();
		int xVal = 0;
		for (int i = 0;i < nOpr; i++) {
			String str = sc.nextLine();
			xVal += str.contains("++") ? 1:-1; 
		}
		System.out.println(xVal);
	}

}
