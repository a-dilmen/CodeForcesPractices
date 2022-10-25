import java.util.Scanner;

public class AWayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ind = scan.nextInt();
		
		for (int i = 0; i<ind; i++) {
			String abbreviation = scan.next();
			int a = abbreviation.length(); 
			if (a>10) {
				String initial = Character.toString(abbreviation.charAt(0));
				String last = Character.toString(abbreviation.charAt(a-1));
				System.out.println(initial+(a-2)+last);
			}else
				System.out.println(abbreviation);
	
		}
	}
}
