package datastructure.pratices.list.singlelinkedlist;

public class LinkedList {
	public Node head;
	public Node next;
//	public int size;

	public LinkedList() {
		super();
	}

//	public void addNode(LinkedList list, int data) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			next = newNode;
//		} else {
//			next.next = newNode;
//			next = newNode;
//		}
//		size++;
//	}

	public void addNodeBeforeFirstNode(int nodeValue) {
		Node node = new Node(nodeValue);
		if (head == null) {
			head = node;
			next = node;
		} else {
			Node temp = head;
			head = node;
			head.next = temp;
		}
//		size = size + 1;
	}

	public void showLinkedList(LinkedList list) {
		if (list.head != null) {
			Node currentNode = list.head;
			while (currentNode.getNext() != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			}
			System.out.println(currentNode.getData() + " ");
		}
//		System.out.println("size is :" + list.size);
	}

	public void addNode(LinkedList linkedList, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			next = newNode;
		} else {
			next.next = newNode;
			next = newNode;
		}
	}

	/*
	 * public LinkedList addNodeToMidOfLinkedList(LinkedList list, Node head){ if
	 * (list.head != null) { Node currentNode = list.head; while
	 * (currentNode.getNext() != null) { currentNode = currentNode.getNext(); }
	 * System.out.print(currentNode.getData() + " "); }
	 * System.out.println("size is :" + list.size); return list; }
	 */
}