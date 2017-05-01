package linkedlist;

public class DeleteReplicatedNodes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node s1 = Node.createLinkedList(10);
		Node s2 = s1.next;
		Node start = s1;
		Node.printLinkedList(start);
		while(s1 != null){
			s2 = s1;
			while(s2.next != null){
				if(s1.data == s2.next.data){
					s2.next = s2.next.next;
				}else{
					s2 = s2.next;
				}
			}
			s1 = s1.next;
		}
		Node.printLinkedList(start);
	}

}

//利用奔跑者進行比對，必須確定runner.next!=null