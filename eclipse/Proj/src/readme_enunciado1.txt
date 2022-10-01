/* *****************************************************************************
 *  Nome:    Alessandro Costa Campagna
 *  No. de aluno:   105088
 *  Curso: LETI
 *
 *  Outro(s) integrante(s):
 *  Nome:  N/A 
 *  No. de aluno: N/A  
 *  Curso: N/A
 *
 *  Horas para realizar o projeto (opcional): 8h
 *
 **************************************************************************** */

Enunciado 1: Deques & Randomized Queues

/* *****************************************************************************
 * Explique brevemente como implementou a fila aleatÃ³ria e o deque.
 * Que estrutura de dados escolheu (array, lista ligada, etc.)
 * e porquÃª?
 **************************************************************************** */

Para o deque utilizei uma linked list com node que apontavam para ambos o proximo e anterior node
com referencia para o primeiro e ultimo Node da fila e um inteiro que indica o numero de Nodes na fila para que fosso possivel realizar todas as operações de forma constante 

Para a randomized queue utilizei um array de dimensão variavel com um inteiro a apontar o numero de itens no array para que tento nas operaçoes de deque como enque pudece
acessar diretamente a um intem sem ter que percorrer a lista;

/* *****************************************************************************
 * Quanta memÃ³ria (em bytes) os seus tipos de dados utilizam para armazenar n itens
 * no pior dos casos? Utilize o modelo de custo de memÃ³ria de 64 bits do Modulo 2
 * e a notaÃ§Ã£o til para simplificar a sua resposta.
 * Justifique brevemente as suas respostas e mostre o seu trabalho.
 *
 * NÃ£o incluir a memÃ³ria para os artigos em si (pois isto
 * a memÃ³ria Ã© atribuÃ­da pelo cliente e depende do tipo de item)
 * ou para qualquer iterador, mas inclua a memÃ³ria para as referÃªncias
 * para os itens (no array subjacente ou lista ligada).
 **************************************************************************** */


Fila de espera aleatÃ³ria:   ~ 8N + 48 bytes

8N + 24 bytes pelo array de itens
4 bytes pelo inteiro N;
16 bytes de cabeçalho
4 bytes padding

Deque: ~  48N + 40 bytes

48N bytes por node ( 16 cabeçalho, 8 cabeçalho extra, 8 referenca a next, 8 referencia a prev, 8 referencia a item)
8 bytes referenca a first
8 bytes referencia a last
4 bytes inteiro size
16 cabeçalho
4 byes padding

/* *****************************************************************************
 * Bugs / limitaÃ§Ãµes conhecidas.
 **************************************************************************** */


/* *****************************************************************************
 * Descreva qualquer ajuda (se houver) que tenha recebido.
 * NÃ£o inclua leituras, palestras, e preceitos, mas inclua qualquer ajuda de pessoas
 * (incluindo colegas do curso, amigos, monitores de laboratÃ³rio, etc.)
 * Identificar os colegas de curso pelo nome.
 **************************************************************************** */




/* *****************************************************************************
 * Descreva quaisquer problemas graves que tenha encontrado.                    
 **************************************************************************** */

Nao concegui testar o Permutation.java como mostrado no enunciado

/* *****************************************************************************
 * Se trabalhou com um colega, afirme abaixo que seguiu
 * o protocolo, tal como descrito no enunciado. 
 * Incluir uma frase que explica como cada um de vÃ³s contribuiu para o projeto.
 **************************************************************************** */



/* *****************************************************************************
 * Listar aqui quaisquer outros comentÃ¡rios. Sinta-se Ã  vontade para dar qualquer   
 * feedback sobre o quanto aprendeu ao fazer o projeto, e se    
 * gostou de o fazer.                                             
 **************************************************************************** */

tive dificuldade em entender como importar as funcões StdIn, StdOut e StdRandom descritas no enuciando
Aprendi a usar Genericos melhor
Gostei particularmente de fazer o deque.java
