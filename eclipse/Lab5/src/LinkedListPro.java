
import java.util.Scanner;
public class LinkedListPro {
    int size;
    Node first, last;

    private class Node {
        String item;
        Node next;
        }


    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return first == null;
    }


    // Devolve o número de itens contidos na fila
    public int size() {
        return this.size;
    }


    // Insere um novo item na fila
    public void enqueue(String item) {
    Node oldlast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty())
    first = last;
    else
    oldlast.next = last;
    this.size++;
    }


    // Retira um item da fila
    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty())
        last = null;
        this.size--;
        return item;

    }

    // Verifica se um item se encontra na fila
    public boolean find(String key) {
        Node node = first;
        int i = 1;
        while (i <= this.size){
            if (node.item.equals(key))
                return true;
            else
                node = node.next;
            i++;
        }
        return false;
    }

    // Método main de teste
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPro llp = new LinkedListPro();
        int en = sc.nextInt(); // número de elementos a inserir na Linked-List
        for (int i = 0; i < en; i++)
        llp.enqueue(sc.next()); // insere palavras na Linked-List
        int deq = sc.nextInt(); // número de elementos a retirar
        for (int i = 0; i < deq; i++)
        llp.dequeue();
        en = sc.nextInt(); // número de elementos a inserir
        for (int i = 0; i < en; i++)
        llp.enqueue(sc.next());
        System.out.println(llp.size() + " " + llp.find(sc.next()));
        sc.close();
        }
}
