package InsertionSort;


import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Neste algoritmo se incia apartir do segundo elemento
 * assim os elementos a esquerda estão sempre ordenados
 *
 * um laço com as comparações será executado
 * do segundo elemento ao ultimo
 * ou seja tamanho do vetor - 1
 *
 * Enquanto existirem elementos a esquerda para comparação
 * e a posição que atende a ordenação que se busca não for encontrada o laço será
 * executado
 *
 * O numero eleito está na posição i e os numeros a esquerda na posição i-1 até 0
 * então o laço a ser executado será
 * 1º {for(int i=0;i<tamanho;i++)}
 * dentro dele
 * int j=i-1;
 * whilw(j>=0 && vetor[j]>vetor[i])
 *
 * */
public class InsertionSort {
//    public static void main(String[]Args){
//        int[] vetor = new int[]{32,12,25,4,654,5,8745,3,18,2,4,5,8,21,54};
//        Date data = new Date();
//        double inicio = data.getTime();
//
//        JOptionPane.showMessageDialog(null, Arrays.toString(vetor)+" :"+data.getTime());
//
//        InsertionSort(vetor);
//        data = new Date();
//        double fim = data.getTime();
//        JOptionPane.showMessageDialog(null, Arrays.toString(vetor)+""+data.getTime());
//        double total = fim - inicio;
//        JOptionPane.showMessageDialog(null, "Tempo total "+total);
//    }
private static int numeroComparacao=0;
    public static int[] InsertionSort(int[] vetorDesordenado){
        int temporario = 0;
        int j=0;
        for (int i=1;i<=vetorDesordenado.length-1;i++){
            numeroComparacao++;
            j=i-1;
            temporario = vetorDesordenado[i];
            while(j>=0 && vetorDesordenado[j] > temporario){
                numeroComparacao+=2;
                vetorDesordenado[j+1] = vetorDesordenado[j];
                j--;
            }
            numeroComparacao++;
            vetorDesordenado[j+1]=temporario;
        }
        numeroComparacao++;
        System.out.println("InsertionSort : "+numeroComparacao);
        return vetorDesordenado;
    }
}
