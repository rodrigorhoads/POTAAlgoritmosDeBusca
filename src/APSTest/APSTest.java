package APSTest;

import BubbleSort.BubbleSort;
import BucketSort.BucketSort;
import CountSort.CoutSort;
import InsertionSort.InsertionSort;
import QuickSort.QuickSortCormen;
import RadixSort.RadixSortGeeks;
import SelectionSort.SelectionSort;
import MergeSort.MergerGeeks;
import HeapSort.HeapSortBruno;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class APSTest {

    public static void main(String[] args){

        int [] A5=gerarNumeroAletorio(5);
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

//*****************  INICIO DO BUBBLESORT ******************************//

        BubbleSort bubbleSort = new BubbleSort(A5.clone());
        bubbleSort = new BubbleSort(A10.clone());
        bubbleSort = new BubbleSort(A50.clone());
        bubbleSort = new BubbleSort(A100.clone());
        bubbleSort = new BubbleSort(Amil.clone());
        bubbleSort = new BubbleSort(A10mil.clone());

//*****************  FIM DO BUBBLESORT ******************************//

//***************** INICIO DO INSERTIONSORT ******************************//

        InsertionSort insertionSort = new InsertionSort(A5.clone());
        insertionSort = new InsertionSort(A10.clone());
        insertionSort = new InsertionSort(A50.clone());
        insertionSort = new InsertionSort(A100.clone());
        insertionSort = new InsertionSort(Amil.clone());
        insertionSort = new InsertionSort(A10mil.clone());

//*****************  FIM DO InsertionSort ******************************//


//***************** INICIO DO SelectionSORT ******************************//

        SelectionSort selectionSort = new SelectionSort(A5.clone());
        selectionSort = new SelectionSort(A10.clone());
        selectionSort = new SelectionSort(A50.clone());
        selectionSort = new SelectionSort(A100.clone());
        selectionSort = new SelectionSort(Amil.clone());
        selectionSort = new SelectionSort(A10mil.clone());

//*****************  FIM DO SelectionSort ******************************//


//***************** INICIO DO MERGESORT ******************************//

        MergerGeeks mergerGeeks = new MergerGeeks(A5.clone());

        mergerGeeks = new MergerGeeks(A10.clone());
        mergerGeeks = new MergerGeeks(A50.clone());
        mergerGeeks = new MergerGeeks(A100.clone());
        mergerGeeks = new MergerGeeks(Amil.clone());
        mergerGeeks = new MergerGeeks(A10mil.clone());



//*****************  FIM DO MERGESORT ******************************//


//************* INICIO QUICK SORT   **********************************************//
        QuickSortCormen quickSortCormen = new QuickSortCormen(A5.clone());

        quickSortCormen = new QuickSortCormen(A10.clone());

        quickSortCormen = new QuickSortCormen(A50.clone());

        quickSortCormen = new QuickSortCormen(A100.clone());

        quickSortCormen = new QuickSortCormen(Amil.clone());

        quickSortCormen = new QuickSortCormen(A10mil.clone());


//************* FIM QUICK SORT   **********************************************//

//************* HEAP SORT**********************************************//
        HeapSortBruno heapSortBruno = new HeapSortBruno(A5.clone());

        heapSortBruno = new HeapSortBruno(A10.clone());
        heapSortBruno = new HeapSortBruno(A50.clone());
        heapSortBruno = new HeapSortBruno(A100.clone());
        heapSortBruno = new HeapSortBruno(Amil.clone());
        heapSortBruno = new HeapSortBruno(A10mil.clone());

//************* HEAP SORT**********************************************//


        RadixSortGeeks radixSortGeeks = new RadixSortGeeks(A5.clone());
        radixSortGeeks = new RadixSortGeeks(A10.clone());
        radixSortGeeks = new RadixSortGeeks(A50.clone());
        radixSortGeeks = new RadixSortGeeks(A100.clone());
        radixSortGeeks = new RadixSortGeeks(Amil.clone());
        radixSortGeeks = new RadixSortGeeks(A10mil.clone());



        BucketSort bucketSort = new BucketSort(A5.clone());
        bucketSort = new BucketSort(A10.clone());
        bucketSort = new BucketSort(A50.clone());
        bucketSort = new BucketSort(A100.clone());
        bucketSort = new BucketSort(Amil.clone());
        bucketSort = new BucketSort(A10mil.clone());



//************* INICIO DO COUNT SORT **********************************************//

        CoutSort countSort = new CoutSort(A5.clone());
        countSort = new CoutSort(A10.clone());
        countSort = new CoutSort(A50.clone());
        countSort = new CoutSort(A100.clone());
        countSort = new CoutSort(Amil.clone());
        countSort = new CoutSort(A10mil.clone());

//************* FIM DO COUNT SORT **********************************************//

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
