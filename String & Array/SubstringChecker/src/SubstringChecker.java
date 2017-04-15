/*P.83 - Q1.8 */

import java.util.Scanner;

public class SubstringChecker {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter string 1:");
			String s1 = scanner.next();
			/*if s1 and s2 is rotated, s1s1 must contains s2*/
			String s1s1 = s1 + s1;
			System.out.println("Enter string 2:");
			String s2 = scanner.next();
			if(s1.length() != s2.length()) {
				System.out.println("Two strings are not rotated!");
			} else {
				if(s1s1.contains(s2)){
					System.out.println("Two strings are rotated!");
				}else{
					System.out.println("Two strings are not rotated!");
				}
			}			
		}
		finally {
			if(scanner!=null)
		        scanner.close();
		}
	}
}

