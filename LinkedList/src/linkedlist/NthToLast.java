package linkedlist;

import java.util.Scanner;

public class NthToLast {
	public static int nthToLast(Node head, int k){
		if(head == null)
			return 0;
		int i = nthToLast(head.next, k)+1;
		if(i == k)
			System.out.println("Ans:" + head.data);
		return i;
		
	}
	public static void main(String[] args) {
		Node s1 = Node.createLinkedList(10);
		Node.printLinkedList(s1);
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int k = sc.nextInt();
			nthToLast(s1, k);

		}
		finally {
			if(sc!=null)
				sc.close();
		}
	}
	


}

//利用遞迴：nthToLast(head, k) = nthToLast(head.next, k)+1;