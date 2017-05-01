package linkedlist;

class CharListNode {
    char val;
    CharListNode next;
    public CharListNode(char x)
    {
        val = x;
        next = null;
    }
}

public class FindBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharListNode start = new CharListNode('a');
		start.next  = new CharListNode('b');
		start.next.next  = new CharListNode('c');
		start.next.next.next  = new CharListNode('d');
		start.next.next.next.next  = new CharListNode('e');
		// c is the Beginning
		start.next.next.next.next.next  = start.next;
		
		CharListNode s1 = start.next;
		CharListNode s2 = start.next.next;
		
		while(s1 != s2){
			s1 = s1.next;
			s2 = s2.next.next;
		}
		
		s1 = start;
		
		while(s1 != s2){
			s1 = s1.next;
			s2 = s2.next;
		}
		
		System.out.println(s1.val);
	}

}
