import java.util.Scanner;
public class StackFixa {
    String[] v;
    int N;

    // Construtor. Cria uma pilha vazia com a capacidade máxima recebida como argumento
public StackFixa (int capacity) {
    this.v= new String[capacity];
    N=0;
}


// Verifica se a pilha está vazia
public boolean isEmpty(){ 
    return N==0;
}


// Devolve o número de itens contidos na pilha
public int size(){
    return N;
}


// Recebe um item, e insere-o na pilha
public void push(String item){
    this.v[N++]=item;
 }


// Retira um elemento da pilha
public String pop(){
    String s = v[--N];
    v[N]=null;
    return s;
}


// Verifica se a pilha está totalmente cheia
public boolean isFull(){
    return N==this.v.length;
}


// Verifica se a pilha tem, pelo menos, metade das posições preenchidas
public boolean isHalfFull(){
    return (this.v.length/2)-1<N;
}


// Dado um número n, retira n itens da pilha e devolve apenas o último item retirado
public String popMultiple(int n){
    String s = "";
    for(int i = 0; i < n; i++)
        s=pop();
    return s;
}


//Método main para testar o algoritmo
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int size = sc.nextInt(); //tamanho da pilha
StackFixa sf = new StackFixa(size);


// Opções possíveis: push:1, pop:2, poplarge: 3, exit:4
int pushpop = sc.nextInt(); // lê opção escolhida
while (pushpop != 4) {
if (pushpop == 1) {
sf.push(sc.next());

}
else if (pushpop == 2)
System.out.println(sf.pop());
else if (pushpop == 3){
int nItens = sc.nextInt(); // número de itens para remover
if (sf.size()>nItens)
System.out.println(sf.popMultiple(nItens));
}


pushpop = sc.nextInt(); // lê a próxima opção escolhida
System.out.println(sf.size() + " " + sf.isEmpty() + " "
+ sf.isFull() + " " + sf.isHalfFull());
}

sc.close();
}

}
