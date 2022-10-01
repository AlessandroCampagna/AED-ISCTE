import java.util.Scanner;

public class ParesLuvas {
    
    
    // Pesquisa se inteiro key existe no array a[] através do algoritmo
    // Binarysearch. Devolve -1 caso não encontre o valor.
    public static int binarySearch(int[] a, int key){
        int lo = 0, hi = a.length-1;
        while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) hi = mid - 1;
        else if (key > a[mid]) lo = mid + 1;
        else return mid;
        }
        return -1;
    }

    private static void exchange(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		}
    
    private static boolean less(int v, int w) {
        return v<w;
    }
    
    
    // Implementam do algoritmo Quicksort no array a[] (não precisa de baralhar o
    // array mas terá de particionar e ordenar recursivamente cada parte).
    private static int partition(int[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        while (true) {
        while (less(a[++i], a[lo])) {
        if (i == hi) break;
        }
        while (less(a[lo], a[--j])) {
        if (j == lo) break;
        }
        if (i >= j) break;
        exchange(a, i, j);
        }
        exchange(a, lo, j); 
        return j; 
    }
   
   
    private static void sort(int[] a, int lo, int hi){
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
   
   
    public static void sort(int[] a){
        sort(a, 0, a.length - 1);
    }
    
    
    // Devolve o número de luvas guardadas no array a[] que não estão no vetor b[].
    // Assume-se que os dois arrays estão ordenados.
    public static int numberOfLostGloves(int a[], int b[]){
        int c =0;
        for(int i=0; i < a.length; i++)
            if (binarySearch(b,a[i]) == -1)
                c++;
        return c;
    }
    
    
    public static void main(String[] args) {
    //1- Recebe o número de luvas da mão esquerda e cria o array para guardá-las
    //2 - Recebe os tamanhos das luvas da mão esquerda e guarda-as no vetor
    //3 - Repete o mesmo processo (1 e 2) para as luvas da mão direita
    //4 - Ordena os dois vetores que guardam as luvas
    //5 - Imprime o número de luvas da mão direita sem par
    //6 - Imprime o número de luvas da mão esquerda sem par

    Scanner sc = new Scanner (System.in);
    int lSize = sc.nextInt();
    int[] ve = new int[lSize];
    for(int i=0; i < lSize; i++)
        ve[i] = sc.nextInt();
    int rSize = sc.nextInt();
    int[] vd = new int[rSize];
    for(int i=0; i < rSize; i++)
        vd[i] = sc.nextInt();
    sort(ve);
    sort(vd);

    System.out.println(numberOfLostGloves(vd,ve)); 
    
    System.out.println(numberOfLostGloves(ve,vd)); 

    sc.close();
    }
    }