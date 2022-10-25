import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kg = scan.nextInt();
		if (kg<101 && kg>3) {
			if(kg%2==0) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
		else System.out.println("NO");
	}

}
