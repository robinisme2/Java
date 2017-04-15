/*P.83 - Q1.5 */

import java.util.Scanner;

public class StringZipper {
	public static String zipString(String s){
		char[] char1 = s.toCharArray();
		int i = 0, countPtr = 0;
		int[] count = new int[char1.length];
		char[] alpha = new char[char1.length];
		count[0] = 1;
		StringBuffer result = new StringBuffer();
		result.append(char1[0]);
		for(i = 1; i < char1.length; i++) {
			if(char1[i] == char1[i-1]) {
				count[countPtr]++;
			}else{
				result.append(alpha[countPtr]);
				result.append(count[countPtr]);
				countPtr++;
				alpha[countPtr] = char1[i];
				count[countPtr] = 1;
			}
		}
		result.append(alpha[countPtr]);
		result.append(count[countPtr]);
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter a string:");
			String s = scanner.next();
			String zipS = zipString(s);
			if(zipS.length() > s.length()){
				System.out.println(s);
			}else{
				System.out.println(zipS);
			}
		}
		finally {
			if(scanner!=null)
		        scanner.close();
		}
	}

}

// Time Complexity of String Concatenation
// String : O(n^2)
// StringBuffer : O(n)
// So, StringBuffer is recommended!