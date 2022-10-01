import java.util.Scanner;
public class ShellsortUnderMicroscope {
    
    /** Compara dois objetos do tipo Comparable. Verifica se a é menor que b */
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    
    
    /** Troca os elementos das posições i e j do array arr */
    private static void exchange(Comparable[] v, int a, int b) {
        Comparable swap = v[a];
        v[a] = v[b];
        v[b] = swap;
    }
    
    
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
        h = 3 * h + 1; 
        while (h >= 1) { 
        for (int i = h; i < N; i++) {
        for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
        exchange(a, j, j - h);
        }
        h = h / 3;
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++)
            System.out.print(" "+a[i]);
            System.out.println();
        }
        
        }
    
    
    /** Main de teste */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().replaceAll("\\s+","").toCharArray();
        Character[] v = new Character[c.length];
        for (int i=0; i< c.length; i++)
        v[i] = c[i];
        sort(v);
    }

}
