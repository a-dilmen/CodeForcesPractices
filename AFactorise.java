package Contest829MyFirstContest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AFactorise {

	public static void main(String[] args) {
		// Codeforces Round #831 Problem A. Factorise N+M
		// Let user input a series of prime numbers
		// Print out another prime number such that input and print number summation is no more prime number 
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int[] ipn = new int[a] ;
		for (int i = 0; i< a; i++) {
			ipn[i] = sc.nextInt();
		}
		int[] pn = {2,3};

		int[] rpn = ipn;
		for (int i = 0; i<a;i++) {
			for (int j = 0; j<pn.length;j++) {
				if ( checkPrime(ipn[i]+pn[j],2)== false) {
					rpn[i] = pn[j];
			
					break;
				}
			}
		}
		for (int i = 0; i < rpn.length; i++) {
			System.out.println(rpn[i]);
		}
				
	}

	static boolean checkPrime(int n, int i)
    {
 
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;      
        // Check for next divisor
        return checkPrime(n, i + 1);
    }
	
}

