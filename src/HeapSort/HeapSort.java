package HeapSort;


/*
* este algoritmo de ordenação é baseado na estrutura de dados Heap, que nada mais
* é do que um vetor que pode ser visto como uma arvore binaria completa
* onde cada nó possui no maximo 2 filhos
*
* Cada vértice da arvore corresponde a um elemento do vetor
*
* A arvore é completamente preenchida exceto no ultimo nível
* Cada nível é sempre diferente da raiz a seguinte propriedade deve ser válida  vetor[Pai(i] >= vetor[i])
*
* dado um indice i do vetor para se descobrir as posições em que se encontram o seu
* o seu pai, o filho esquerdo e o direito, realizam-se os calculos
*
 *  Pai(i) - i/2;
*
*   FilhoEsquerdo(i) = e*i;
*
*   FilhoDireito(i) = 2*i+1;
*
*
*   INICIALMENTE TRANFORMA-SE o vetor num HEAP utilizando o metodo heap_max
*
*    o metodo heap_max verifica se um determinado elemento da posição j
*    atende a propriedade
*
*    Caso não atenda o maior de seus filhos é trocado com
 *    o pai j que não atende a propriedade HEAP, i o processo continua até levar
 *    o elemento j a uma folha ou até que a propriedade seja satisfeita
 *
 *
 *    Apos inicia-se a ordenação Com o HEAP sendo um vetor o
 *    maio elemento ficará na RAIZ , então o primeiro elemento
 *    pode ser trocado com o ultimo de maneira que ocupará
 *    a posição correta do vetor, visto que quem está na raiz
 *    é o maior elemento e deve ficar na última posição
 *
 *    Apos feita a troca desconsidera-se o ultimo elemento
 *    e aplica-se o metodo heap_max novamente
 *    sobre a raiz da arvore que deixou de atender a propriedade
 *    HEAP.
 *    Dessa forma apos o metodo obtem-se o maior elemento na raiz
 *    e pode ser feito o mesmo processo de troca com o penultimo elemento
 *    o processo continua até que a arvore permanecer com o ultimo
 *    elemento
 *
 *
 *    Para analisar a complexidade é preciso analisar
 *    metodo por metodo
 *
 *    O metodo heap_max é aplicado sempre a um no da arvore que
 *    representa na verdade um elemento do vetor, e "afunda" esse nó até
 *    que a propriedade HEAP seja válida.
 *
 *    O pior caso ocorre quando o procedimento é aplicado
 *    sobre o primeiro elemento raiz e este deve "afundar"[
 *    até alcançar uma folha
 *
 *    Logo o numero de trocas realizadas corresponderá á altura
 *    da árvore que é log n
 *
 *    Portanto o procedimento heap_max gasta O(log n)
 *
 *    O metodo transforma_heap utiliza o metodo heap_max
 *
 *    Considerando o tamanho do vetor que formam
  *    o HEAP e a estrutura de repetição for será executada tamanho/2 vezes e
  *    ainda queo temmpo de execução do heap_max é log n portanto
  *    o tempo de execução do transforma_heap é T(n)= n/2*log n = O(n * log n)
  *
  *
  *    O método ordena pussui um laço que é executado n-1 vezes
  *    as linhas de atribuição tem custo constante O(1)
  *
  *    e a chamada para heap_max custa log n
  *
  *    portanto o tempo de execução T(n) = (n-1)*log n =
   *
   *    ==>> O(n log n)
  *
 *
 *
 *
* */

import java.util.Arrays;

public class HeapSort {
        public static int[] vetor = new int[]{12,2,65,8,7,4,5,44,32,56,4494};

            public static void main(String[]args){
                System.out.println(Arrays.toString(vetor));
                transforma_heap(vetor.length-1);
                ordena(vetor.length-1);
                System.out.println(Arrays.toString(vetor));
            }

            public static void transforma_heap(int tamanho){
                int i , pai , auxiliar;
                
                for(i=tamanho/2;i>=1;i--){
                    hear_max(i,tamanho);
                }
            }

        private static void hear_max(int i, int tamanho) {
                int filho_esquerdo, filho_direito, maior, auxiliar;

                maior=i;

                if(2*i+1<=tamanho){
                    //o no que está sendo analisado
                    //tem filhos para esquerda e para direita

                    filho_esquerdo = 2*i+1;
                    filho_direito=2*i;

                    if(vetor[filho_esquerdo]>=vetor[filho_direito] && vetor[filho_esquerdo] > vetor[i]){
                        maior = 2*i+1;
                    }else if(vetor[filho_direito]>vetor[filho_esquerdo] && vetor[filho_direito]>vetor[i]){
                        maior=2*i;
                    }

                }else if(2*i<=tamanho){
                    /*  o no que está sendo analisado
                        tem filho apenas para a direita
                    * */

                    filho_direito = 2*i;

                    if(vetor[filho_direito] > vetor[i]){
                        maior = 2*i;
                    }

                }
                if(maior!=i){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[maior];
                    vetor[maior] = auxiliar;
                    hear_max(maior,tamanho);
                }
        }

        public static void ordena(int tamnho){
                int i, auxiliar, ultima_posicao;

                for(i = tamnho;i>=2;i--){
                    auxiliar = vetor[i];
                    vetor[1]=vetor[i];
                    ultima_posicao = i-1;
                    hear_max(1,ultima_posicao);
                }
        }


    }


















