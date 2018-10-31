package InsertionSort;


import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Neste algoritmo se incia apartir do segundo elemento
 * assim os elementos a esquerda estão sempre ordenados
 *
 * um laço com as comparações será executado
 * do segundo elemento ao ultimo
 * ou seja tamanho do vetor - 1
 *
 * Enquanto existirem elementos a esquerda para comparação
 * e a posição que atende a ordenação que se busca não for encontrada o laço será
 * executado
 *
 * O numero eleito está na posição i e os numeros a esquerda na posição i-1 até 0
 * então o laço a ser executado será
 * 1º {for(int i=0;i<tamanho;i++)}
 * dentro dele
 * int j=i-1;
 * whilw(j>=0 && vetor[j]>vetor[i])
 *
 * */
public class InsertionSort {

private static int numeroComparacao;

    public InsertionSort(int[]array) {
        numeroComparacao= 0;
        InsertionSort(array);
        System.out.println("InsertionSort numero de comparações "+numeroComparacao);
//        System.out.println("InsertionSort ordenado "+Arrays.toString(array));
    }

    public static void InsertionSort(int[] vetorDesordenado){
        int j=0;

        for (int i=1;i<=vetorDesordenado.length-1;i++){
            j=i;
            while(j > 0 && vetorDesordenado[j-1] > vetorDesordenado[j]){
                numeroComparacao++;
                Trocar(vetorDesordenado,j-1,j);
                j--;
            }

        }

    }

    public static void Trocar(int []array,int i,int j){
        int temp = 0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}
