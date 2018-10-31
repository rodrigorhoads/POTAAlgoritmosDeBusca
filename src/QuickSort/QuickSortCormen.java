package QuickSort;


import BubbleSort.BubbleSort;

import java.util.Arrays;

public class QuickSortCormen {

    public static int numeroDeComparacoes ;

    public QuickSortCormen(int[] array) {
        numeroDeComparacoes = 0;
        Sort(array,0,array.length-1);
        System.out.println("QuickSortC numero comparações "+numeroDeComparacoes);
//        System.out.println("QuickSortC ordenado "+Arrays.toString(array));
    }

    public static void Sort(int[]array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = Particionar(array, inicio, fim);
            Sort(array, inicio, meio-1);
            Sort(array, meio + 1, fim);
        }
    }
    private static int Particionar(int[] array, int inicio, int fim) {

        int x = array[fim];
        int i = (inicio - 1);

        for(int j=inicio ;j <fim;j++){
            numeroDeComparacoes++;
            if(array[j] <= x){
                i=i+1;
                Trocar(array,i,j);
            }
        }
        Trocar(array,i+1,fim);
        return i+1;
    }

    private static void Trocar(int[] array, int i, int j) {
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


    public void Imprime() {
        System.out.println("QuickSortCormen = "+numeroDeComparacoes);
    }
}
