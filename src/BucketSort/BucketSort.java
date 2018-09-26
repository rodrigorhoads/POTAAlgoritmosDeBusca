package BucketSort;

import BubbleSort.BubbleSort;

import java.util.Arrays;

public class BucketSort {

//    public static void main(String args[]){
//        int[]array = BubbleSort.gerarNumeroAletorio(50);
//
//        System.out.println(Arrays.toString(array));
//
//        sort(array,array.length);
//
//        System.out.println(Arrays.toString(array));
//
//
//    }

    private static int numeroComparacoes=0;

    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            numeroComparacoes++;
            bucket[i]=0;
        }
        numeroComparacoes++;

        for (int i=0; i<a.length; i++) {
            numeroComparacoes++;
            bucket[a[i]]++;
        }
        numeroComparacoes++;

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            numeroComparacoes++;
            for (int j=0; j<bucket[i]; j++) {
                numeroComparacoes++;
                a[outPos++]=i;
            }
            numeroComparacoes++;
        }
        numeroComparacoes++;

        System.out.println("BucketSort "+numeroComparacoes);
    }

    @Override
    public String toString() {
        return "BucketSort " +numeroComparacoes;
    }
}
