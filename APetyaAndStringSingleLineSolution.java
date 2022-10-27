import java.util.Scanner;

public class APetyaAndStringSingleLineSolution {

	public static void main(String[] args) {
		// A program to compare two strings of same size lexicographically
		
		//Scanner object creation and getting input
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
	
		//using ternary if, toLowerCase() and compareTo() methods to compare two strings lexicographically 
		System.out.println(a = a.toLowerCase().compareTo(b.toLowerCase()) >
			0 ? "1": a.toLowerCase().compareTo(b.toLowerCase()) < 0 ? "-1" : "0");  
		//used string (a) that has already been defined to be able to print out in a single Line and to avoid more memory usage  
		
		
	}

}
