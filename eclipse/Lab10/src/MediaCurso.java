import java.util.Scanner;
public class MediaCurso {
    
    
    //Representa o nó da raíz da Binary Search Tree
     Node root;
    
    
    //Classe Nó
    private class Node {
        private String key;
        private double val;
        private Node left, right;

        public Node(String key, double val) {
            this.key = key;
            this.val = val;
            }
    }
    
    
    //Associa o valor à chave na BST
    public void put(String key, double val) {root = put(root, key, val);}
    
    
    //Associa o valor à chave na BST.
    //Se o nó já existir, substitui o seu valor pelo recebido
    private  Node put(Node x, String key, double val) {
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
    
    
    //Devolve o valor correspondente à chave recebida,
    // ou 0 se não encontrar a chave
    public double get(String key) {
        Node x = root;
        while (x != null) {
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
        x = x.left;
        else if (cmp > 0)
        x = x.right;
        else 
        return x.val;
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
    // Constrói uma BST e insere os pares (key, value)
    // Recebe o total de notas
    // Recebe as avaliações qualitativas
    // Calcula e imprime a média final
    
    MediaCurso mc = new MediaCurso();
    mc.put("E",17.32);
    mc.put("MB",16);
    mc.put("B",14.68);
    mc.put("B-",13.32);
    mc.put("S",12);
    mc.put("S-",10.68);
    mc.put("I+",9.32);
    mc.put("I",8);
    mc.put("I-",6.68);
    mc.put("F+",4);
    mc.put("F",0);

    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt();
    double media = 0;
    for(int i = 0; i<size; i++){
        String nota = sc.next();
        media+=mc.get(nota);
    }
    media/=size;

    System.out.println(media);
    sc.close();
    }
    }