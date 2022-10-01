import java.util.Scanner;
public class UnionFind {
    int [] array;
    int[] size;
    int comp;
    
    public UnionFind (int size){
    this.comp = size;
        this.array = new int[size];
        this.size = new int[size];
        for (int i = 0; i < size; i++) {
          this.array[i] = i;
          this.size[i] = 1;
        }
    }

    public int count(){
        return this.comp;
    }


    public int find (int site){
        while (this.array[site] != site) {
            site = this.array[site];
        }
        return site;
    }

    public boolean connected (int site1, int site2){
       return (find(site1) == find(site2));
    }

    public void union(int site1, int site2){
        int a = find(site1);
        int b = find(site2);
        if (a == b) return;
        if (this.size[a] < this.size[b]){
            this.array[a] = b;
            this.size[b] += this.size[a];
        }
        else{
            this.array[b] = a;
            this.size[a] += this.size[b];
        }
        this.comp--;
    }

    public static void main(String[] args) {
        //inicializa variáveis e classe UnionFind
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        UnionFind uf = new UnionFind(size);
        int nTest = in.nextInt();
        //testes dos métodos find, connected, union e count
        while (nTest>0){
        int site1 = in.nextInt();
        int site2 = in.nextInt();
        System.out.println(uf.find(site1));
        System.out.println(uf.connected(site1, site2));
        uf.union(site1, site2);
        System.out.println(uf.connected(site1, site2));
        System.out.println(uf.count());
        nTest--;
        }
        in.close();
        }
}