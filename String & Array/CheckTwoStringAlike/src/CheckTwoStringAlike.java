/*P.82 - Q1.3 */

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringAlike {
	
	public static boolean isTwoStringAlike(String s1, String s2) {
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		String s1_new = new String(char1);
		String s2_new = new String(char2);
		System.out.println(s1_new);
		System.out.println(s2_new);
		if(s1_new.equals(s2_new))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter string 1:");
			String s1 = scanner.next();
			System.out.println("Enter string 2:");
			String s2 = scanner.next();
			if(s1.length() != s2.length()) {
				System.out.println("Two strings are not alike!");
			} else {
				if(isTwoStringAlike(s1, s2) == true) {
					System.out.println("Two strings are alike!");
				} else {
					System.out.println("Two strings are not alike!");
				}
			}			
		}
		finally {
			if(scanner!=null)
		        scanner.close();
		}

	}

}

// O(nlog^n)
// Convert string to charArray by String.toCharArray()
// Arrays.sort(charArray);
