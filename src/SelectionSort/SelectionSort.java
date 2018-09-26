package SelectionSort;


import BubbleSort.BubbleSort;

import java.util.Arrays;

/*
* neste algoritmo cada numero apartir do primeiro
* é eleito e comparado com o menor ou maior dependendo
* do tipo de ordenação, dentre os numeros a direita do eleito
*
* quando a condição for satisfeita este troca de posição com o eleito
*  assim todos os numeros a esquerda sempre ficam ordenados
*
*  Um laço com as comparações e executado do primeiro ao penultimo
*  tamanho do vetor -1 {for(int i=0;i<tamanho-1;i++)
*
*  pois as comparações serão executadas com os elementos a direita do eleito
*  e o numero da ultima posição quebraria a execução
*
*  o elemento eleito está na posição i e os elementos a se comparar estao nas
*  posições i+1 até tamanho-1
*
*  O segundo laço para encontrar o menor elemento a direita será
*  {for(int j=i+2;j<=tamanho-1;j++)}
*
*  Lembrando que o primeiro elemento a direita do eleito
*  começa sendo considerado o menor numero
*
*
* */
public class SelectionSort {

//    public static void main (String []args){
//
//        int[] array= BubbleSort.gerarNumeroAletorio(45);
//        SelectionSort(array);
//        System.out.println(Arrays.toString(array));
//    }
    private  static int numeroComparacao=0;

    public static int[] SelectionSort(int[] vetorDesordenado){
        int temporario = 0;
        int posicao=0;
        int menor=0;

        for(int i=0;i<vetorDesordenado.length-1;i++){
            numeroComparacao++;
            temporario =vetorDesordenado[i];
            menor=vetorDesordenado[i+1];
            posicao=i+1;
            for(int j=i+2;j<vetorDesordenado.length;j++){
                numeroComparacao++;
                if(vetorDesordenado[j]<menor){
                    menor = vetorDesordenado[j];
                    posicao=j;
                }
                numeroComparacao++;
            }
            numeroComparacao++;
            numeroComparacao++;
            if(menor<temporario){
                vetorDesordenado[i]=vetorDesordenado[posicao];
                vetorDesordenado[posicao]=temporario;
            }
        }
        numeroComparacao++;
        System.out.println("SelectioSort : "+numeroComparacao);
        return  vetorDesordenado;
    }
}

