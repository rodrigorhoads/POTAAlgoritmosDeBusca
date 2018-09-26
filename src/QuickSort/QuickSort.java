package QuickSort;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {

    /*
    * Neste algoritmo o vetor é particionado em dois por meio de recursão
    *
    * Essa divisão ocorre até que o vetor fique apenas com um elemento
    *  enquanto os demais ficam ordenasdos a medida que ocorre  o particionamento
    *
    *  Também é baseado em principios de divisão e conquista
    *
    *  DIVIDIR = o vetor e particionado em dois subvetores
    *
    *  x1[p..q] e x2[q+1..r] tais que cada elemento em x1[p..q] é menor ou igaul a cada elemento em
    *  x2[q+1..r] O indice é calculado conforme o processo de particionamento
    *
    *  Para determinar o indice (q) escolhe-se o elemento que se arranja
    *  na metade do vetor original, chamado pivô
    *   e rearranjam-se os elementos do vetor de forma que os que ficaram á esquerda
    *   de (q) são maiores maiores ou iguais ao pivô
    *
    * CONQUISTAR = os dois subvetores são ordenados  x1[p..q] e x2[q+1..r]
    * por chamadas recursivas ao QUICKSORT
    *
    * COMBINAR =  durante o processo recursivo, os elementos vão sendo ordenados
     * no proprio vetor, não exigindo nenhum processamento nessa etapa
     *
     *
     *
     * ANALISE DO QUICKSORT
     *
     * durante o procedimento de particionamento o tempo
      * de execução do algoritmo é limitedo pelo tamanho do vetor
      * Esse procedimento realiza O(n) comparações
      *
      *
      * O tempo de execução do quicksort depende se o particionamento é
      * ou não balanceado
      * Se é BALANCEADO executa tão rapido quanto o mergesort
      * SE NÃO BALACEADO executa igual ao insertionsort
      *
      * o pior caso ocorre quando o procedimento de particionamento produz
      *uma regiao com n-1 elementos e a outra somente com 1
      *
      * A recorrencia para o tempo de execução do quicksort é T(n) = T(n-1_+n;
      *
      * A recorrencia para o pior caso obtida pelo metodo de expansão telescopica
      * t(n) = Tn-1+n
      * t(n) = T(n-2)+n)+n =T(n-2)+2n
      * ...
      * T(n) = T(n-i)+in
      *
     * Deve-se calcular o valor de i para obter o tempo final
     *
     * considerando que a recursao termina quando atinge
      * o vetor de tamanho 1 (T(1))
      * e o custo para se ordenar tal vetor é O(n),
      * n-i=1
      * i=n-1
      *
      * Agora substitui-se o valor de i na expressão de cima (expansão telescopica)
      *chegando ao valor de O(n^2)
      *
      * o melhor caso ocorre quando o procedimento de particionamento produz duas
      * regioes de tamnho n/2
      *
      * A recorrencia do melhor caso é
      * T(n) = n+T(n/2)+T(n/2)
      * T(n)=2T(n/2)+n
      *
      *
      *
      *
      *
    * */



    private  static int numeroComparacoes=0;

    public  int getNumeroComparacoes() {
        return numeroComparacoes;
    }

    public  void setNumeroComparacoes(int Comparacoes) {
        numeroComparacoes = Comparacoes;
    }

    public  void troca(int[] vetor, int i, int j){
        int auxiliar ;

        auxiliar = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = auxiliar;
    }

    public  int particao(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
numeroComparacoes++;

            numeroComparacoes++;
            if (arr[j] <= pivot)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
numeroComparacoes++;

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public  void quickSort(int vetor[],int p,int r){
        int q;
        numeroComparacoes++;
        if(p < r){
            q=particao(vetor,p,r);
            quickSort(vetor,p,q-1);
            quickSort(vetor,q+1,r);
        }

    }

    @Override
    public String toString() {
        return "QuickSort "+numeroComparacoes;
    }


}















