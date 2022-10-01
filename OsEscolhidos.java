import java.util.Scanner;
public class OsEscolhidos {
    
    private int[] keys = new int[10];
    private String[] vals = new String[10];
    private int n = 0;

    private void resize(){
        int[] vk = new int[n*2];
        String[] vv = new String[n*2];

        for (int i = 0; i<n; i++){
            vk[i]=keys[i];
            vv[i]=vals[i];
        }

        keys = vk;
        vals= vv;
    }

    public int rank(int key) {
        int lo = 0, hi = n-1;
        while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (key < keys[mid]) hi = mid - 1;
        else if (key > keys[mid]) lo = mid + 1;
        else return mid;
        }
        return lo;
        }
    
    /** Insere o item dado pelo par (key, val) à tabela de símbolos. Se a chave já
    * existir, substitui o seu valor pelo valor dado como argumento.
    */
    public void put(int key, String val) {
        if (n==0 || n==keys.length) resize();
        int i = rank(key);
        if (i < n && keys[i]==key)
            vals[i]=val;
        else{
            for( int j = n-1; j>=i; j--){
                keys[j+1]=keys[j];
                vals[j+1]=vals[j];
            }
            keys[i]=key;
            vals[i]=val;
        }
        n++;
    }
    
    
    /** Devolve a menor chave associada ao valor recebido como argumento. Se não
    * encontrar uma chave associada ao valor dado, devolve -1 (registo inválido)
    */
    public int getFirstRegistered(String val) {
        for ( int i = 0; i < n; i++ )
            if (vals[i] == val)
                return keys[i];
        return -1;
    }
    
    
    public static void main(String[] args) {
    OsEscolhidos oe = new OsEscolhidos();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); // número de candidaturas
    // guarda as candidaturas
    for (int i = 0; i < n; i++) {
    int register = in.nextInt();
    String agency = in.next();
    oe.put(register, agency);
    }
    // Imprime os escolhidos
    System.out.println(oe.getFirstRegistered("ESA") + " ESA");
    System.out.println(oe.getFirstRegistered("NASA") + " NASA");
    in.close();
    }
    }