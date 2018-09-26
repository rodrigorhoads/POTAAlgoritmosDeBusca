package APSTest;

import BubbleSort.BubbleSort;
import BucketSort.BucketSort;
import CountSort.CoutSort;
import HeapSort.HeapSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import RadixSort.RadixSortGeeks;
import SelectionSort.SelectionSort;
import MergeSort.MergerGeeks;
import HeapSort.HeapSortGeeks;
import java.util.Arrays;
import java.util.Random;

public class APSTest {

    public static void main(String[] args){

        int  [] A5=gerarNumeroAletorio(5);
        int [] A10=gerarNumeroAletorio(10);
        int [] A50=gerarNumeroAletorio(50);
        int [] A100=gerarNumeroAletorio(100);
        int [] Amil=gerarNumeroAletorio(1000);
        int [] A10mil=gerarNumeroAletorio(10000);
        System.out.println(Arrays.toString(A5));
        System.out.println(Arrays.toString(A10));
        System.out.println(Arrays.toString(A50));
        System.out.println(Arrays.toString(A100));
        System.out.println(Arrays.toString(Amil));
        System.out.println(Arrays.toString(A10mil));

        BubbleSort.BubbleSort(A5.clone());
        BubbleSort.BubbleSort(A10.clone());
        BubbleSort.BubbleSort(A50.clone());
        BubbleSort.BubbleSort(A100.clone());
        BubbleSort.BubbleSort(Amil.clone());
        BubbleSort.BubbleSort(A10mil.clone());



        InsertionSort.InsertionSort(A5.clone());
        InsertionSort.InsertionSort(A10.clone());
        InsertionSort.InsertionSort(A50.clone());
        InsertionSort.InsertionSort(A100.clone());
        InsertionSort.InsertionSort(Amil.clone());
        InsertionSort.InsertionSort(A10mil.clone());

        SelectionSort.SelectionSort(A5.clone());
        SelectionSort.SelectionSort(A10.clone());
        SelectionSort.SelectionSort(A50.clone());
        SelectionSort.SelectionSort(A100.clone());
        SelectionSort.SelectionSort(Amil.clone());
        SelectionSort.SelectionSort(A10mil.clone());

        MergerGeeks mergerGeeks = new MergerGeeks();


         mergerGeeks.sort(A5.clone(),0,A5.length-1);
        System.out.println(mergerGeeks.toString());
        mergerGeeks.setNumeroComparacao(0);

        mergerGeeks.sort(A10.clone() ,0 ,A10.length-1).toString();
        System.out.println(mergerGeeks.toString());
        mergerGeeks.setNumeroComparacao(0);

        mergerGeeks.sort(A50.clone(),0,A50.length-1).toString();
        System.out.println(mergerGeeks.toString());
        mergerGeeks.setNumeroComparacao(0);

        mergerGeeks.sort(A100.clone(),0,A100.length-1).toString();
        System.out.println(mergerGeeks.toString());
        mergerGeeks.setNumeroComparacao(0);

        mergerGeeks.sort(Amil.clone(),0,Amil.length-1).toString();
        System.out.println(mergerGeeks.toString());
        mergerGeeks.setNumeroComparacao(0);

        mergerGeeks.sort(A10mil.clone(),0,A10mil.length-1);
        System.out.println(mergerGeeks.toString());



        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(A5.clone(),0,A5.length-1);
        System.out.println(quickSort.toString());
        quickSort.setNumeroComparacoes(0);

        quickSort.quickSort(A10.clone() ,0 ,A10.length-1);
        System.out.println(quickSort.toString());
        quickSort.setNumeroComparacoes(0);

        quickSort.quickSort(A50.clone(),0,A50.length-1);
        System.out.println(quickSort.toString());
        quickSort.setNumeroComparacoes(0);

        quickSort.quickSort(A100.clone(),0,A100.length-1);
        System.out.println(quickSort.toString());
        quickSort.setNumeroComparacoes(0);

        quickSort.quickSort(Amil.clone(),0,Amil.length-1);
        System.out.println(quickSort.toString());
        quickSort.setNumeroComparacoes(0);

        quickSort.quickSort(A10mil.clone(),0,A10mil.length-1);
        System.out.println(quickSort.toString());



        HeapSortGeeks.sort(A5.clone());
        HeapSortGeeks.sort(A10.clone());
        HeapSortGeeks.sort(A50.clone());
        HeapSortGeeks.sort(A100.clone());
        HeapSortGeeks.sort(Amil.clone());
        HeapSortGeeks.sort(A10mil.clone());



            RadixSortGeeks radixSortGeeks = new RadixSortGeeks();
                radixSortGeeks.radixsort(A5.clone(),A5.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        radixSortGeeks.radixsort(A10.clone(),A10.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        radixSortGeeks.radixsort(A50.clone(),A50.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        radixSortGeeks.radixsort(A100.clone(),A100.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        radixSortGeeks.radixsort(Amil.clone(),Amil.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        radixSortGeeks.radixsort(A10mil.clone(),A10mil.length);
        System.out.println(radixSortGeeks.toString());
        radixSortGeeks.setNumeroCompracoes(0);

        HeapSortGeeks.sort(A5.clone());
        HeapSortGeeks.sort(A10.clone());
        HeapSortGeeks.sort(A50.clone());
        HeapSortGeeks.sort(A100.clone());
        HeapSortGeeks.sort(Amil.clone());
        HeapSortGeeks.sort(A10mil.clone());

        BucketSort.sort(A5.clone(),A5.length);
        BucketSort.sort(A10.clone(),A10.length);
        BucketSort.sort(A50.clone(),A50.length);
        BucketSort.sort(A100.clone(),A100.length);
        BucketSort.sort(Amil.clone(),Amil.length);
        BucketSort.sort(A10mil.clone(),A10mil.length);


        CoutSort.sort(A5.clone());
        CoutSort.sort(A10.clone());
        CoutSort.sort(A50.clone());
        CoutSort.sort(A100.clone());
        CoutSort.sort(Amil.clone());
        CoutSort.sort(A10mil.clone());


        System.out.println(Arrays.toString(A5));
        System.out.println(Arrays.toString(A10));
        System.out.println(Arrays.toString(A50));
        System.out.println(Arrays.toString(A100));
        System.out.println(Arrays.toString(Amil));
        System.out.println(Arrays.toString(A10mil));
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
