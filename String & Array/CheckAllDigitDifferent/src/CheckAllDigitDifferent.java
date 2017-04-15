/*P.82 - Q1.1 */

import java.util.Scanner;

public class CheckAllDigitDifferent {
	
	public static boolean isAllCharDifferent(String s){
		int i,j;
		for(i = 0; i < s.length(); i++){
			for(j = i + 1; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter a string:");
			String s = scanner.next();
			if(s.length() > 256) {
				System.out.println("Not All Digits are different!");
			}
			if(isAllCharDifferent(s) == true) {
				System.out.println("All Digits are different!");
			} else {
				System.out.println("Not All Digits are different!");
			}
		}
		finally {
			if(scanner!=null)
		        scanner.close();
		}
		
		

	}

}

// 1. if ASCII encoding, if s.length() > 256, there's replicated chars.
// 2. Digit Operation is a good method to reduce space & time-complexity