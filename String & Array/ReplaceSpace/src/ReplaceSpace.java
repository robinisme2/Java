/*P.83 - Q1.4 */

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter a string:");
			String s = scanner.nextLine();
			int length = s.trim().length();
			char[] charArray = s.toCharArray();
			int i = 0;
			int space = 0;
			for (i = 0; i < length; i++){
				if (charArray[i] == ' ') {
					space++;
				}
			}
			int newlength = length + space*2;
			charArray[newlength] = '\0';
			for (i = length - 1; i >= 0; i--) {
				if(charArray[i] == ' '){
					charArray[newlength -1] = '0';
					charArray[newlength -2] = '2';
					charArray[newlength -3] = '%';
					newlength -= 3;
				}else{
					charArray[newlength - 1] = charArray[i];
					newlength -= 1;
				}
			}
			System.out.println(charArray);
			
			
			
		}
		finally {
			if(scanner!=null)
		        scanner.close();
		}
	}

}

//1. next() can read the input only till the space. It can't read two words separated by space. 
//Also, next() places the cursor in the same line after reading the input.
//nextLine() reads input including space between the words (that is, it reads till the end of line \n). 
//Once the input is read, nextLine() positions the cursor in the next line.

//2. 必須加強digit處理的能力

