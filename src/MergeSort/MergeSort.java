package MergeSort;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/*
 * nete algoritmo o vetor é dividido em vetores menores com a metade do
 * tamanho do original por meio de recursão
 * Essa divisão se repete até que o vetor fique com apenas um elemento
 * e esses elementos sejam  ordenados e intercalados
 *
 *
 * Essa Solução utiliza o conceito de divisão e conquista
 * envolve os seguintes passos
 * 1°dividir o problema em um certo numero de subproblemas
 *
 * 2°Conquuistar os subproblemas recursivamente, se o tamanho dos subproblemas
 *   são pequenos o bastante então solucionar os subproblemas de forma simples
 *
 *3°Combinar as soluções dos subproblemas na solução do problema original
 *
 *
 * DIVIDR = divide-se o tamanho do vetor a ser ordenado em duas subsequencias de tamanho/2 elementos
 *
 * CONQUISTAR = ordenar as duas subsequencias recursivamente utilizando ordenação por intercalaçao
 *
 * COMBINAR = intercalar as duas subsequencias ordenadas para produzir a solução
 *
 *Para calcular o tempo de execução é necessário
 * calcular o tempo de execução da função intercala
 * que realiza de dois eventos faz a varredura de dois vetores com tamanhos
 * m1 e m2 percorre todas as posições, gastando T=m1+m2
 *
 *
 * Analisando o trecho de codigo, o algoritmo Merge realiza três chamadas de função, sendo que duas primeiras
 * sao chamadas recursivas e recebem metade dos elementos do vetor passado,   e uma chamada para intercalar
 *
 * A linha de atribuição e comparação gastam tempo constatne O(1)
 *
 * Para calcular o algoritmo recursivo deve-se primeiro obter a função de recorrencia
 *
 * Então considerando os principios da função de piso e teto a expressão de recorrecia
 * é dada por T(n) = 2T(n/2)+n
 *
 * 2T(n/2) corresponde as duas chamadas recursivas e n ao tempo de intercalação
 *
 * a recorrencia resolvida pelo metodo master
 *
 * resulta em T(n) = O(n log n)
 *
 * **/
public class MergeSort {
    private static int fim = 0;
    private static int inicio = 0;
    private static int meio = 0;
    private static int tamanhoVetor = 0;

    public static void main(String[] args) {
        int[] vetor = new int[]{32,12,25,4,654,5,8745,3,18,2,4,5,8,21,54};


        tamanhoVetor = vetor.length;

        System.out.println(Arrays.toString(vetor));
        Merge(vetor,0,tamanhoVetor-1);
        System.out.println(Arrays.toString(vetor));
    }

    public static int numeroCompracao=0;

    @Override
    public String toString() {
        return ""+numeroCompracao;
    }

    public static int[] Merge(int[] vetor, int inicio, int fim) {
        int meio;
        numeroCompracao++;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            Merge(vetor, inicio, meio);
            Merge(vetor, meio + 1, fim);
            Intercalar(vetor, inicio, fim, meio);
        }

        return vetor;
    }

    private static void Intercalar(int[] vetor, int inicio, int fim, int meio) {
        int posicaoLivre, inicio_vetor1, inicio_vetor2, i;

        int[] auxiliar = new int[tamanhoVetor];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        posicaoLivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            numeroCompracao+=2;
            if (vetor[inicio_vetor1] <= vetor[inicio_vetor2]) {
                auxiliar[posicaoLivre] = vetor[inicio_vetor1];
               inicio_vetor1=inicio_vetor1+1;
            } else {
                auxiliar[posicaoLivre] = vetor[inicio_vetor2];
                inicio_vetor2 =inicio_vetor2+ 1;
            }
            posicaoLivre =posicaoLivre+ 1;
        }
        numeroCompracao++;

        //se ainda existirem elementos do primeiro vetor que não foram intercalados

        for (i = inicio_vetor1; i <= meio; i++) {
            auxiliar[posicaoLivre] = vetor[i];
            posicaoLivre =posicaoLivre+ 1;
        }

        //se ainda existirem elementos do segundo vetor que nao foram intercalados
        for (i = inicio_vetor2; i <= fim; i++) {
            auxiliar[posicaoLivre] = vetor[i];
            posicaoLivre =posicaoLivre+ 1;
        }

        //retorna os valores do vetor auxiliar para o vetor
        for (i = inicio; i <= fim; i++) {
            vetor[i] = auxiliar[i];
        }
    }

}
