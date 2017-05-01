package linkedlist;

import java.util.Random;

public class Node {
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
		next = null;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
		
	}
	
	public static Node createLinkedList(int length){
		Random ran = new Random();
		int i;
		Node s = new Node((int)(ran.nextInt(10)));
		Node start = s;
		for(i = 0; i < length-1; i++){
			s.appendToTail((int)(ran.nextInt(10)));
		}
		return start;
	}
	
	public static void printLinkedList(Node start){
		while(start.next!=null){
			System.out.print(start.data);
			start = start.next;
		}
		System.out.print(start.data);
		System.out.println();
	}
}
