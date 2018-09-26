package BubbleSort;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*
* Algoritmo de ordenação por troca
* São executadas comparações entre os dados
 * armazenados em um vetor de tamanho N
 *
 * cada elemento de posição i será comparado
 * com o elemento i+1
 * e caso a ordenação desejada seja encontrado
 * uma troca entre os elementos e efetuada
 *
 * Um laço inicial com a quandidade de elementos
 * do vetor será executado
 * e
 * dentro desse um outro laço da primeira a penultima
 * posição do vetor
 *
 *
 *
 * * */

//ANÁLISE DE COMPLEXIDADE
public class BubbleSort {

    private static int numeroComparacoes = 0;
//    public static void main (String[]Args){
//        int tamanho=0;
//        while(tamanho<=0){
//
//            try{
//                tamanho = Integer.parseInt(JOptionPane.showInputDialog(null,"Favor informar o tamanho do array a ser usado"));
//            }catch (NumberFormatException nex){
//                JOptionPane.showMessageDialog(null,"O numero deve sem inteiro sem casas decimais e numerico");
//            }
//        }
//
//
//        int[] vetor = gerarNumeroAletorio(tamanho);
//
//
//
//        long tempoIncial = System.nanoTime();
//        System.out.println(Arrays.toString(vetor)+" :"+tempoIncial);
//        BubbleSort(vetor);
//        long tempofinal = System.nanoTime();
//        System.out.println(Arrays.toString(vetor)+""+tempofinal);
//        long tempoTotal = (tempofinal-tempoIncial)/100;
//        JOptionPane.showMessageDialog(null, "Tempo total :"+tempoTotal);
//    }

    public static int[] BubbleSort(int[] vetorDesordenado){
        int temporario = 0;

        for(int i=0;i<vetorDesordenado.length;i++){
            for(int j=i;j<vetorDesordenado.length-1;j++)
            {
                numeroComparacoes++;
                if(vetorDesordenado[i] > vetorDesordenado[j+1]){
                    temporario = vetorDesordenado[i];
                    vetorDesordenado[i]=vetorDesordenado[j+1];
                    vetorDesordenado[j+1]=temporario;
                }
            }
            numeroComparacoes++;
        }
        numeroComparacoes++;
        System.out.println("BubbleSort : "+numeroComparacoes);
        return vetorDesordenado;
    }

    /*
    * tempo de execução é (n-1)+...+3+2+1
    * O(n^2)
    * */

    public static int[] BubleSortV1(int[] vetor){
        int temporario=0;
        for(int i=0;i<vetor.length;i++){
            for(int j=vetor.length-1;j>i;j--){
                if(vetor[j]<vetor[i]){
                    temporario=vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i]=temporario;
                }
            }
        }
        return vetor;
    }

    /*
    * no melhor caso gasta O(n)
    * no pior caso gasta O(n^2)
    * igual a todos os outros
    *
    * n(n-1)=n^2-n
    * */

    public static int[] BubleSortV2(int[] vetor){
        int temporario = 0;
        boolean troca=true;

        while(troca){
            troca = false;
            for (int i=0;i<vetor.length-1;i++){
                if(vetor[i]>vetor[i+1]){
                    troca=true;
                    temporario=vetor[i];
                    vetor[i]=vetor[i+1];
                    vetor[i+1]=temporario;
                }
            }
        }

        return vetor;
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
