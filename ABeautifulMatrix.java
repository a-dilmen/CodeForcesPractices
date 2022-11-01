import java.util.Scanner;

public class ABeautifulMatrix {

	public static void main(String[] args) {
		// A Beautiful Matrix - 263A		
		//Scanner Object
		Scanner sc = new Scanner(System.in);
		//distance x & y axis
		int x = 0;	
		int y = 0;	
		//input 5v5 matrix 0's and one 1
		for(int i = 0; i<5;i++) {
			//input read as string
			String a = sc.nextLine();
			//check for whether 1 is in string
			if (a.contains("1")){
				//y distance
				y = i;
				//Casting String to integer
				String[] arr = a.split(" ");
				//seeking for x distance
				for(int j = 0;j<5;j++) {
					if (Integer.valueOf(arr[j]) == 1) {
						x = j;
					}
				}
			}
		}	
		//checking distance to center
		int xDistance=Math.abs(x-2);
		int yDistance=Math.abs(y-2);
		int tDistance = xDistance+yDistance;
		System.out.println(tDistance);
		System.out.println(y+""+yDistance);
		sc.close();
	}

}
