package MergeSort;

import BubbleSort.BubbleSort;
import com.sun.tools.javac.Main;

import java.util.Arrays;

public class MergerGeeks {



    public static int numeroComparacao= 0 ;

    public  int[] sort(int[]array,int inicio,int fim){
        numeroComparacao++;
        if(inicio<fim){
            int meio = (inicio+fim)/2;

            sort(array,inicio,meio);
            sort(array,meio+1,fim);

            intercalar(array,inicio,meio,fim);
        }

        return array;
    }

    @Override
    public String toString() {
        return "MergeSort "+numeroComparacao;
    }

    public void intercalar(int[] array, int inicio, int meio, int fim) {

        int n1 = meio - inicio + 1;
        int n2 = fim- meio;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i){
            L[i] = array[inicio + i];
            numeroComparacao++;
        }
        numeroComparacao++;
        for (int j=0; j<n2; ++j){
            R[j] = array[meio + 1+ j];
            numeroComparacao++;
        }

        numeroComparacao++;
        int i = 0, j = 0;

        int k = inicio;

        while (i < n1 && j < n2)
        {
            numeroComparacao++;
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        numeroComparacao++;


        while (i < n1)
        {
            numeroComparacao++;
            array[k] = L[i];
            i++;
            k++;
        }
        numeroComparacao++;


        while (j < n2)
        {
            numeroComparacao++;
            array[k] = R[j];
            j++;
            k++;
        }
        numeroComparacao++;
    }

    public  int getNumeroComparacao() {
        return numeroComparacao;
    }

    public void setNumeroComparacao(int numero)
    {
        numeroComparacao=numero;
    }
}
