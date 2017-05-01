package linkedlist;

public class Palidrome {
	static int len = 0;
	public static void reverseList(CharListNode start, CharListNode[] array){
		if(start == null)
			return;
		
		reverseList(start.next, array);
		
		array[len] = start;
		len++;
	}
	
	public static void isPalidrome(CharListNode start, CharListNode[] array, int length){
		String s1 = "", s2 = "";
		int i;
		for(i = 0; i < length; i++){
			s1 += start.val;
			start = start.next;
		}
		for(i = 0; i < length; i++){
			s2 += array[i].val;
		}
		/*s1 == s2 : s1 and s2 with the same address.
		s1.equals(s2) : s1 and s2 with the same value.*/
		if(s1.equals(s2)){
			System.out.println("Is Palidrome!");
		}else{
			System.out.println("Is Not Palidrome!");
		}
	}
	
	public static void main(String[] args) {
		int length = 4;
		// TODO Auto-generated method stub
		CharListNode start = new CharListNode('a');
		start.next = new CharListNode('b');
		start.next.next = new CharListNode('b');
		start.next.next.next = new CharListNode('a');

		CharListNode[] array = new CharListNode[length];
		//reverse a list with recursion.
		reverseList(start, array);
		isPalidrome(start, array, length);
	}

}

