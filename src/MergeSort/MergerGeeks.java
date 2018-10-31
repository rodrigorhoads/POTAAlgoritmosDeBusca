package MergeSort;

import BubbleSort.BubbleSort;
import com.sun.tools.javac.Main;
import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class MergerGeeks {



    public static int numeroComparacao;

    public MergerGeeks(int[] array) {
        numeroComparacao=0;
        sort(array,0,array.length-1);
        System.out.println("MergeSort numero de comparações "+numeroComparacao);
//        System.out.println("MergeSort ordenado "+Arrays.toString(array));
    }

    public static void sort(int[]array, int inicio, int fim){
        if(inicio<fim){
            int meio = (inicio+fim)/2;
            sort(array,inicio,meio);
            sort(array,meio+1,fim);
            intercalar(array,inicio,meio,fim);
        }
    }


    public static void intercalar(int[] array, int inicio, int meio, int fim) {

        int qtdEleAEsquerda = meio - inicio + 1;
        int qtdEleADireita = fim- meio;

        int VetorEsquerdo[] = new int [qtdEleAEsquerda];
        int VetorDireito[] = new int [qtdEleADireita];

        for (int i=0; i<qtdEleAEsquerda; ++i){
            VetorEsquerdo[i] = array[inicio + i];
        }

        for (int j=0; j<qtdEleADireita; ++j){
            VetorDireito[j] = array[meio + 1+ j];
        }

        int i = 0;//indice inicial do subarray da esquerda
        int j = 0;//indice inicial do subarray da direita

        int k = inicio;//indice inicial do array "fundigo","misturado"

        //enquanto os indices forem menores que a quantidade de elementos em cada
        //lado dos subarrays ele realiza as comparações e devidas trocas
        while (i < qtdEleAEsquerda && j < qtdEleADireita)
        {
            numeroComparacao++;
            //pega o menor elemento e coloca na posição 'certa' do vetor original
            //vai organizando de partições menores para partiçoes maiores
            //a medida que acontece o retorno da recursão
            //e o vetor vai se ordenando conforme retorna
            if (VetorEsquerdo[i] <= VetorDireito[j])
            {
                array[k] = VetorEsquerdo[i];
                i++;
            }
            else
            {

                array[k] = VetorDireito[j];
                j++;
            }
            k++;
        }

        //caso o indice seja menor que a quantidade
        //de elementos no subarray correspondente ele
        //devolve os elementos ao array original
        //se estiverem em posições corretas já estaram ordenados
        while (i < qtdEleAEsquerda)
        {
            array[k] = VetorEsquerdo[i];
            i++;
            k++;
        }

        //caso o indice seja menor que a quantidade
        //de elementos no subarray correspondente ele
        //devolve os elementos ao array original
        //se estiverem em posições corretas já estaram ordenados
        while (j < qtdEleADireita)
        {
            array[k] = VetorDireito[j];
            j++;
            k++;
        }

    }

}
