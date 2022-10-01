import java.util.Scanner;
public class Par {


    int[] a;
    //Construtor: recebe o tamanho do vetor e o primeiro elemento. Preenche o vetor.
    
    public Par (int size, int first) {
    a = new int[size];
    for (int i = 0; i<a.length; i++)
    a[i] = first+i;
    }


    //Devolve o número total de pares cuja soma é 0
    public int checkPairs (){
    int count = 0;
    int N = (int) a.length/2;

    for (int i = 0; i < N; i++)
    if (a[i] + a[a.length - 1 - i] == 0)
    count++;
    return count;
    }


    //função main para testar o algoritmo
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //tamanho do vetor
    int size = in.nextInt();
    //valor inicial
    int first = in.nextInt();
    Par soma = new Par(size,first);
    System.out.println(soma.checkPairs());
    in.close();
    }
    }