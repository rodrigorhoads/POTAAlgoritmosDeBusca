package BucketSort;

import BubbleSort.BubbleSort;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {

    private static int numeroComparacoes;

    public BucketSort(int []array){
        numeroComparacoes=0;
        BucketSortGit(array,encontrarMaior(array));
        System.out.println("BucketSort numero de comparações "+numeroComparacoes);
//        System.out.println("BucketSort ordenado "+Arrays.toString(array));
    }

    public static void BucketSortGit(int[]array,int maximo){

        Bucket[] buckets = new Bucket[10];

//        inicializa os objetos do buckets

        for(int indice=0;indice<buckets.length;indice++){
            buckets[indice] = new Bucket();
        }

        /*
        * percorre o array original e cria o indice para inserir o numero
        * */

        for(int n : array){
            int buckIndice = (n * 10) / (maximo+1);
            buckets[buckIndice].bucket.add(n);
        }

        int indice = 0;

        for(Bucket n: buckets){
            insertionSort(n.bucket);
            //coloca numero ordenado no novo array
            for(int num : n.bucket){
                array[indice] = num;
                indice++;
            }
        }

    }

    public static void insertionSort(ArrayList<Integer> array){
        for(int indiceCountador = 0;indiceCountador<array.size()-1;indiceCountador++){
            int j = indiceCountador;

            while (j >=0 && array.get(j) > array.get(j+1)){
                numeroComparacoes++;
                Trocar(array,j,j+1);
                j--;
            }
        }
    }

    private static void Trocar(ArrayList<Integer> array, int j, int i) {
        int temporario = array.get(j);
        array.set(j,array.get(i));
        array.set(i,temporario);
    }

    @Override
    public String toString() {
        return "BucketSort " +numeroComparacoes;
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


class Bucket{
    ArrayList<Integer> bucket = new ArrayList<>();
}