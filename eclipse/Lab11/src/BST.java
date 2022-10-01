import java.util.Scanner;
public class BST<Key extends Comparable<Key>, Value> {
        
    private Node root; // raiz da BST

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    public Value get(Key key) { return get(root, key);}
    public void put(Key key, Value val) {  root = put(root, key, val); }
    public Key max() { return max(root); }
    public int height() { return height(root);}
    public void printBST() {printInorder(root); System.out.println("");}

    private Value get(Node x, Key key) {
        // Caso base:
        if (x == null)
        return null;
        // Caso recursivo:
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.val;
        }
    
    private Node put(Node x, Key key, Value val) {
            if (x == null)
            return new Node(key, val);
            int cmp = key.compareTo(x.key);
            if (cmp < 0)
            x.left = put(x.left, key, val);
            else if (cmp > 0)
            x.right = put(x.right, key, val);
            else
            x.val = val;
            return x;
    }    
    
    private Key max(Node x) {
        while(x.right != null)
        x = x.right;
        return x.key;
    }

    private int height(Node x) {
        int h = 0;
        if(x == null) return -1;
        if(x.right == null && x.left == null) return 0;
        int hl= height(x.left);
        int hr= height(x.right);
        if(hl >= hr) h+=hl;
        else h+=hr;

        return h+1;

    }

    private void printInorder(Node x) {
        if(x == null) return;
        printInorder(x.left);
        System.out.print(x.key+" ");
        printInorder(x.right);
    }


    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // n�mero de pares a ler
        for(int i = 0; i < size; i++) {
        bst.put(sc.next(), sc.nextInt());
        }
        sc.close();
        // Resultados:
        bst.printBST(); // Imprime BST
        System.out.println("max = " + bst.max()); // Imprime a maior chave
        System.out.println("height = " + bst.height()); // Imprime altura
    }
}