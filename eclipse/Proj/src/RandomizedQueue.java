import java.util.Scanner;
import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private Item[] v;
	private int N;

	
	// construct an empty randomized queue
	public RandomizedQueue() {
		this.v = (Item[]) new Object[1];
		this.N = 0;
	}


	private void resize(){

		if(this.N>=this.v.length){

			Item v2[] = (Item[]) new Object[N*2];
			for(int i = 0; i < N; i++) v2[i] = this.v[i];
			this.v = v2;

		}else if(this.N <= this.v.length/4 && this.N > 0){

			Item v2[] = (Item[]) new Object[v.length/2];
			for( int i = 0; i < this.v.length/4; i++) v2[i] = this.v[i];
			this.v = v2;

		}

	}

	private class rqIterator implements Iterator<Item> {
		private int Ni = N;
		private Item[] vi = (Item[]) new Object[v.length];

		public rqIterator(){
			for (int i = 0; i < Ni; i++)
			vi[i]=v[i];
		}

		public boolean hasNext() {
			return Ni>0;
		}

		public Item next(){
			if (!hasNext()) throw new NoSuchElementException();
			int i = StdRandom.uniform(Ni);
	        Item item = vi[i];
		    if( i != Ni-1) vi[i] = vi[Ni-1];
		    vi[Ni-1]=null;
		    Ni--;
			return item;
		}
	}
	
	
	// is the randomized queue empty?
	public boolean isEmpty() {
		return this.N==0;
	}
	
	
	// return the number of items on the randomized queue
	public int size() {
		return this.N;
	}
	
	
	// add the item
	public void enqueue(Item item) {
		if (item == null) throw new IllegalArgumentException();
		resize();
		this.v[N]=item;
		this.N++;
	}
	
	
	// remove and return a random item
	public Item dequeue() {
		if (N == 0) throw new NoSuchElementException();
		int i = StdRandom.uniform(N);
		Item item = this.v[i];
		if( i != N-1) v[i] = v[N-1];
		v[N-1]=null;
		N--;
		resize();
		return item;
	}
	
	
	// return a random item (but do not remove it)
	public Item sample() {
		if (N == 0) throw new NoSuchElementException();
		int i = StdRandom.uniform(N);;
		return v[i];
	}
	
	
	// return an independent iterator over items in random order
	public Iterator<Item> iterator(){
		return new rqIterator();
	}
	
	
	// unit testing (required)
	public static void main(String[] args) {
		RandomizedQueue<String> rq = new RandomizedQueue<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Esta vazia: "+rq.isEmpty());
		System.out.println("Tamanho: "+rq.size());
		System.out.println("Numero de Strings a inserir:");
		int size = sc.nextInt();
		System.out.println("Insere Strings:");
		for ( int i = 0; i < size; i++)
		rq.enqueue(sc.next());
		System.out.println("Esta vazia: "+rq.isEmpty());
		System.out.println("Tamanho: "+rq.size());
		for(String str : rq)
		System.out.println(str);
		System.out.println("Removing random");
		rq.dequeue();
		for(String str : rq)
		System.out.println(str);
		System.out.println("Esta vazia: "+rq.isEmpty());
		System.out.println("Tamanho: "+rq.size());
		System.out.println("Random Item");
		System.out.println(rq.sample());
		sc.close();
	}
}
