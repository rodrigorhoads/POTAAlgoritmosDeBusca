package BubbleSort;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*
* Algoritmo de ordenação por troca
* São executadas comparações entre os dados
 * armazenados em um vetor de tamanho N
 *
 * cada elemento de posição i será comparado
 * com o elemento i+1
 * e caso a ordenação desejada seja encontrado
 * uma troca entre os elementos e efetuada
 *
 * Um laço inicial com a quandidade de elementos
 * do vetor será executado
 * e
 * dentro desse um outro laço da primeira a penultima
 * posição do vetor
 *
 *
 *
 * * */

//ANÁLISE DE COMPLEXIDADE
public class BubbleSort {

    private static int numeroComparacoes ;

    public BubbleSort(int []array) {
        numeroComparacoes = 0;
        BubbleSort(array);
        System.out.println("BubbleSort numero de comparações "+numeroComparacoes);
//        System.out.println("BubbleSort ordenado"+Arrays.toString(array));
    }

    public static void BubbleSort(int[] vetorDesordenado){

        for(int i=0;i<vetorDesordenado.length;i++){
            for(int j = 1;j<vetorDesordenado.length;j++)
            {
                numeroComparacoes++;
                if(vetorDesordenado[j-1] > vetorDesordenado[j]){

                    Troca(vetorDesordenado, j-1, j);
                }
            }
        }
    }

    private static void Troca(int[] vetorDesordenado, int i, int j) {
        int temporario = vetorDesordenado[i];
        vetorDesordenado[i]=vetorDesordenado[j];
        vetorDesordenado[j]=temporario;
    }



    public static int[] gerarNumeroAletorio(int tamanho)
    {
        int[] array = new int[tamanho];

        for(int i=0;i<array.length;i++){
            array[i] =new Random().nextInt(tamanho)+1;
        }
        return array;
    }

}
