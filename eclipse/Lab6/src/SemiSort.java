import java.util.Scanner;
public class SemiSort {

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
    
    
    /** Ordena parcialmente o array arr até a posição dada p (inclusive).
    * Se p está fora dos limites do array, mantém o array inalterado.
    */
    public static void sort(Comparable[] v, int p) {
        for (int i = 0; i <= p; i++)
        for (int j = i; j > 0; j--)
        if (less(v[j],v[j - 1]))
        exchange(v, j, j - 1);
        else
        break;
    }
    
    
    /** Main de teste */
    public static void main(String[] args) {
    //1 - Recebe o tamanho do array, e cria um array de inteiros
    //2 - Recebe a posição do array até onde deve ser ordenado
    //3 - Preenche o array com os inteiros que recebe a partir do Scanner
    //4 - Ordena parcialmente o vetor
    //5 - Imprime o vetor parcialmente ordenado

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int p = sc.nextInt();
    Integer[] v = new Integer[size];
    for (int i = 0; i < size; i++)
        v[i]=sc.nextInt();
    sort(v, p);
    for (int i = 0; i < size; i++)
        System.out.println(v[i]);
    }

}
