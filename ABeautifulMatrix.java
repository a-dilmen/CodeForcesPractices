import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ABeautifulMatrix {

	public static void main(String[] args) throws IOException {
		// A Beautiful Matrix - 263A		
		//Scanner Object
		Scanner sc = new Scanner(System.in);
		//distance x & y axis
		int l = 0;	
		int k = 0;	
		//input 5v5 matrix 0's and one 1
		for(int i = 0; i<5;i++) {
			//input read as string
			String a = sc.nextLine();
			//check for whether 1 is in string
			if (a.contains("1")){
				//y distance
				k = i;
				//Casting String to integer
				String[] arr = a.split(" ");
				//seeking for x distance
				for(int j = 0;j<5;j++) {
					if (Integer.valueOf(arr[j]) == 1) {
						l = j;
					}
				}
			}
		}
		//initializing number of moves
		int summ = 0;
		//checking distance to center
		if (k<=2) {
			summ = summ+2-k;
		}else 
			summ = summ+k-2;
		
		if (l<=2) {
			summ = summ+2-l;
		}else 
			summ = summ+l-2;
		//printing result
		System.out.println(summ);
	}

}
