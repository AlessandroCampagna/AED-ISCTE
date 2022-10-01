import java.util.Scanner;
public class QuickFind {

	int[] array;
    int comp;

    public QuickFind (int size){
        this.comp = size;
        this.array = new int[size];
        for (int i = 0; i < size; i++)
          this.array[i] = i;
    }

    public int count(){
        return this.comp;
    }

    public int find (int site){
        return this.array[site];
    }

    public boolean connected (int site1, int site2){
        return (this.array[site1] == this.array[site2]);
    }

    public void union(int site1, int site2){
        if (this.array[site1] != this.array[site2]){
            int a = this.array[site1];
            int b = this.array[site2];
        for (int i = 0; i < this.array.length; i++)
            if (this.array[i] == a)
              this.array[i] = b;
     this.comp--;
    }}

    public static void main(String[] args) {
        //inicializa variáveis e classe QuickFind
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        QuickFind qf = new QuickFind(size);
        int nTest = in.nextInt();
        //testes dos métodos find, connected, union e count
        while (nTest>0){
        int site1 = in.nextInt();
        int site2 = in.nextInt();
        System.out.println(qf.find(site1));
        System.out.println(qf.connected(site1, site2));
        qf.union(site1, site2);
        System.out.println(qf.connected(site1, site2));
        System.out.println(qf.count());
        nTest--;
        }
        in.close();
        }
}
