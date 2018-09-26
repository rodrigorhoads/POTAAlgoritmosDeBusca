package HeapSort;

import BubbleSort.BubbleSort;

import java.util.Arrays;

public class HeapSortGeeks {

    private static int numeroComparacoes=0;

    public static void main(String[]args){
        int [] array = BubbleSort.gerarNumeroAletorio(45);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void sort(int arr[])
    {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
            numeroComparacoes++;
        }


        numeroComparacoes++;


        for (int i=n-1; i>=0; i--)
        {
            numeroComparacoes++;


            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr, i, 0);
        }
        numeroComparacoes++;

        System.out.println("HeapSort "+numeroComparacoes );
    }


    public static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;


        numeroComparacoes++;
        if (l < n && arr[l] > arr[largest])
        {
            largest = l;
        }


        numeroComparacoes++;
        if (r < n && arr[r] > arr[largest])
            largest = r;


        numeroComparacoes++;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }
}
