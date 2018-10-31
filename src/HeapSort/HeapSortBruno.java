package HeapSort;

import BubbleSort.BubbleSort;

import java.net.PortUnreachableException;
import java.util.Arrays;

public class HeapSortBruno {


    public static int numerocomparações;

    public HeapSortBruno(int[]array){
        numerocomparações=0;
        Sort(array,array.length);
        System.out.println("HeapSort numemro de comparações "+numerocomparações);
//        System.out.println("HeapSort "+Arrays.toString(array));
    }



    public static void Sort(int[]array,int tamanho){
        CriarHeap(array,tamanho);
        int fim =tamanho-1;
        while (fim>0){
            Trocar(array,0,fim);
            fim--;
            arrumarHeap(array,0,fim);
        }
    }

    public static void CriarHeap(int[]arrray,int tamanho){
        int inicio = (int) Math.floor((tamanho-2)/2);
        while(inicio >=0){
            arrumarHeap(arrray,inicio,tamanho-1);
            inicio--;
        }
    }

    private static void arrumarHeap(int[] arrray, int inicio, int fim) {
        int raiz = inicio;
        int filho=0;
        int troca=0;

        while(raiz*2+1 <= fim){
            filho=raiz*2+1;
            troca = raiz;
            numerocomparações++;
            if(arrray[troca]<arrray[filho]){
                troca=filho;
            }
            numerocomparações++;
            if(filho+1<=fim && arrray[troca]<arrray[filho+1]){
                troca =filho+1;
            }
            if(troca==raiz){
                return;
            }else   {
                Trocar(arrray,raiz,troca);
                raiz=troca;
            }

        }
    }

    private static void Trocar(int[] arrray, int raiz, int troca) {
        int temp=arrray[raiz];
        arrray[raiz]=arrray[troca];
        arrray[troca]=temp;
    }
}
