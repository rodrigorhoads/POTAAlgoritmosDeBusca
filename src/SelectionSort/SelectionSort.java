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

    private static int numeroComparacao;

    public SelectionSort(int[] array) {
        numeroComparacao = 0;
        Sort(array);
        System.out.println("SelectionSort numero de comparações" + numeroComparacao);
//        System.out.println("SelectionSort ordenado " + Arrays.toString(array));
    }

    public static void Sort(int[] array) {
        for (int ultimoIndiceDesordenado = array.length - 1;
             ultimoIndiceDesordenado > 0; ultimoIndiceDesordenado--) {
            int maior = 0;
            for (int i = 1; i <= ultimoIndiceDesordenado; i++) {
                numeroComparacao++;
                if (array[i] > array[maior]) {
                    maior = i;
                }
            }
            Trocar(array, maior, ultimoIndiceDesordenado);
        }
    }

    private static void Trocar(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

