import java.util.Scanner;
public class MergesortUpdated {

	private static final int CUTOFF = 7;

	private static class Insertion <T extends Comparable<T>>{
		public static void sort(Comparable[] a, int lo, int hi) {
		for (int i = lo; i <= hi; i++)
		for (int j = i; j > lo; j--)
		if (less(a[j],a[j - 1]))
		exchange(a, j, j - 1);
		else
		break;
		}
		
		private static void exchange(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		}
		}
	
	// Implementa o algoritmo de merging sobre o array a[]
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
	
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) aux[k] = a[j++];
			else if (j > hi) aux[k] = a[i++];
			else if (less(a[j], a[i])) aux[k] = a[j++];
			else aux[k] = a[i++];
		}
	}
	
	// Ordena recursivamente o array a[]
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){

		
		if (hi <= lo + CUTOFF) {
			Insertion.sort(a, lo, hi);
			return;
		}

		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(aux, a, lo, mid);
		sort(aux, a, mid+1, hi);
		merge(aux, a, lo, mid, hi);
	}
	
	
	// Cria c�pia do array a[] e invoca o procedimento sort recursivo
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		for (int k = 0; k < a.length; k++) {
			aux[k] = a[k];
		}
		sort(a, aux, 0, a.length-1);
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
		}
	
	
	public static void main(String[] args) {
	// 1 � Recebe o tamanho do array
	// 3 � Preenche o array com os inteiros que recebe a partir do Scanner
	// 4 � Ordena o array
	// 5 � Imprime o array

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Integer[] v = new Integer[size];
		for (int i = 0; i < size; i++)
			v[i]=sc.nextInt();
		sort(v);
		for (int i = 0; i < size; i++)
			System.out.print(v[i]+" ");

		
		
	}
}
