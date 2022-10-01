import java.util.Scanner;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

	private Node first, last;
	private int size;

	private class Node {
		Item item;
		Node next, prev;

		private Node(Item item){
			this.item=item;
			this.next = null;
			this.prev = null;
		}
	}

	private class DequeIterator implements Iterator<Item>{
		private Node current = first;

		public boolean hasNext() { return current != null; }

		public Item next() {
			if ( current == null) throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
	}


	// construct an empty deque
	public Deque() {
		this.first = null;
		this.last = null;
		this.size=0;
	}


	// is the deque empty?
	public boolean isEmpty() {
		return this.size==0;
	}
	
	
	// return the number of items on the deque
	public int size() {
		return this.size;
	}
	
	
	// add the item to the front
	public void addFirst(Item item) {
		if (item == null) throw new IllegalArgumentException();
		if(first == null) 
			last = first = new Node(item);
		else{
			Node oldf = this.first;
			this.first = new Node(item);
			this.first.next = oldf;
			oldf.prev = this.first;
		}
		this.size++;
	}
	
	
	// add the item to the back
	public void addLast(Item item) {
		if (item == null) throw new IllegalArgumentException();
		if(last == null) 
			last = first = new Node(item);
		else{
			Node oldl = this.last;
			this.last = new Node(item);
			oldl.next = this.last;
			this.last.prev = oldl;
		}
		this.size++;
	}
	
	
	// remove and return the item from the front
	public Item removeFirst() {
		if ( isEmpty() ) throw new NoSuchElementException();
		Item item = this.first.item;
		if(size == 1) this.first = this.last = null;
		else{
			this.first = this.first.next;
			this.first.prev = null;
		}
		this.size--;
		return item;
	}
	
	
	// remove and return the item from the back
	public Item removeLast() {
		if ( isEmpty() ) throw new NoSuchElementException();
		Item item = this.last.item;
		if(size == 1) this.first = this.last = null;
		else{
			this.last = this.last.prev;
			this.last.next = null;
		}
		this.size--;
		return item;
	}
	
	
	// return an iterator over items in order from front to back
	
	
	public Iterator<Item> iterator(){
		return new DequeIterator();
	}
	
	
	// unit testing (required)
	public static void main(String[] args) {
		
		Deque<String> dq = new Deque<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Esta vazia: "+dq.isEmpty());
		System.out.println("Tamanho: "+dq.size());
		System.out.println("Numero de Strings a inserir:");
		int size = sc.nextInt();
		System.out.println("Insere Strings:");
		for ( int i = 0; i < size; i++)
		dq.addLast(sc.next());
		System.out.println("Esta vazia: "+dq.isEmpty());
		System.out.println("Tamanho: "+dq.size());
		for(String str : dq)
		System.out.println(str);
		System.out.println("Removing last");
		dq.removeLast();
		System.out.println("Esta vazia: "+dq.isEmpty());
		System.out.println("Tamanho: "+dq.size());
		for(String str : dq)
		System.out.println(str);
		System.out.println("Removing First");
		dq.removeFirst();
		System.out.println("Esta vazia: "+dq.isEmpty());
		System.out.println("Tamanho: "+dq.size());
		for(String str : dq)
		System.out.println(str);
		System.out.println("Adcicona uma String ao Inicio: ");
		dq.addFirst(sc.next());
		System.out.println("Esta vazia: "+dq.isEmpty());
		System.out.println("Tamanho: "+dq.size());
		for(String str : dq)
		System.out.println(str);
		sc.close();
	}
}
