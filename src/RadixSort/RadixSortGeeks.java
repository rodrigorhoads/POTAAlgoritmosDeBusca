package RadixSort;

import java.util.Arrays;

public class RadixSortGeeks {

    public  static int numeroCompracoes=0;

    public  int getNumeroCompracoes() {
        return numeroCompracoes;
    }

    public  void setNumeroCompracoes(int numero) {
        RadixSortGeeks.numeroCompracoes = numero;
    }





    public void radixsort(int arr[], int n)
    {

        int m = getMax(arr, n);


        for (int exp = 1; m/exp > 0; exp *= 10){
            numeroCompracoes++;
            countSort(arr, n, exp);
        }
            numeroCompracoes++;
    }


    public int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            numeroCompracoes++;
            if (arr[i] > mx)
                mx = arr[i];
        }
        numeroCompracoes++;
        return mx;
    }




    public void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        for (i = 0; i < n; i++){
            count[ (arr[i]/exp)%10 ]++;
            numeroCompracoes++;
        }
        numeroCompracoes++;

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
            numeroCompracoes++;
        }
        numeroCompracoes++;

        for (i = n - 1; i >= 0; i--)
        {
            numeroCompracoes++;
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
        numeroCompracoes++;


        for (i = 0; i < n; i++) {
            arr[i] = output[i];
            numeroCompracoes++;
        }
        numeroCompracoes++;
    }

    @Override
    public String toString() {
        return "RadixSort "+numeroCompracoes;
    }
}
