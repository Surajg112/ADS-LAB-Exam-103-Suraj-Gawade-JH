import java.util.*;
class NodeReverse {
	Node head;
	static class Node {
		int data;
		Node next;
		void Node(int data) {
		this.data = data;
		this.next = next;
		}
	}
	void display() {
		Node current = head;
		while(current!= null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
		void insert(int new_data) {
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		head = new_Node;
		}
	
	Node reverse(Node head) {
		if(head == null) {
			return head;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current!= null) {
			next = current.next;
			current.next =  previous;
			previous = current;
			current= next;
		}
		return previous;
		
	}
	public static void main(String[] args) {
		NodeReverse n1 = new NodeReverse();
		//Scanner sc = new Scanner(System.in);

		//testcase 1
		
		n1.insert(1);
		n1.insert(5);
		n1.insert(1);
		n1.insert(2);
		n1.insert(3);
		n1.insert(4);
		n1.insert(5);
		n1.reverse();
		n1.display();
		
		System.out.println("");		
		
		//testcase 2
		n1.insert(2);
		n1.insert(4);
		n1.insert(3);
		n1.insert(4);
		n1.insert(2);
		n1.insert(5);
		n1.reverse();
		n1.display();
	}
}