import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
	
public static void main(String[] args) {
	
    RandomizedQueue<String> rq = new RandomizedQueue<String>();
    int k = Integer.valueOf(args[0]);
    
    while(StdIn.isEmpty() == false)
    	rq.enqueue(StdIn.readString());
    
    for (; k>0;k--)
    	StdOut.println(rq.dequeue());
}
}
