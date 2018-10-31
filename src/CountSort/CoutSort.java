package CountSort;

import java.util.Arrays;

public class CoutSort {

    private static int numeroComparacoes;

    public CoutSort(int[]array){
        numeroComparacoes=0;
        sort(array);
        System.out.println("CountSort numero de comparações"+numeroComparacoes);
//        System.out.println("CountSort ordenado "+ Arrays.toString(array));
    }

    public static void sort(int[] array) {

        int maior = encontrarMaior(array);

        int[] count = new int[maior+1];

        for(int i= 0;i<array.length;i++){
            count[array[i]]+=1;
        }

        int indice = 0;

        for(int i=0;i<count.length;i++){
            while (count[i]>0){
                numeroComparacoes++;
                array[indice]=i;
                indice++;
                count[i]-=1;
            }
        }
    }

    private static int encontrarMaior(int[] array) {
        int maior= array[0];

        for(int i=1;i<array.length;i++){
            if(maior<array[i]){
                maior=array[i];
            }
        }
        return maior;
    }
}
