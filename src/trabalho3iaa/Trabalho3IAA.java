/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3iaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juliana Mareco Medeiros
 */
public class Trabalho3IAA {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Caminho: ");
        String arq = entrada.nextLine();
        System.out.println("");

        int cont = 0;
        BufferedReader arquivo = new BufferedReader(new FileReader(arq));
        String primeira = arquivo.readLine();
        int tamanho = Integer.parseInt(primeira); // Quantidade de itens no txt

        int vetor[] = new int[tamanho];

        // Leitura do txt e inserção no vetor
        while (arquivo.ready()) {
            String numero = arquivo.readLine();
            int valor = Integer.parseInt(numero);
            vetor[cont] = valor;
            cont++;
        }

        // QuickSort
        QuickSort QS = new QuickSort();
        System.out.print("QuickSort: ");
        System.out.println(Arrays.toString(QS.quickSort(vetor, 0, tamanho - 1)));

        //HeapSort
        HeapSort HS = new HeapSort();
        System.out.print("HeapSort: ");
        System.out.println(Arrays.toString(HS.heapSort(vetor, tamanho)));

        //MergeSort
        MergeSort MS = new MergeSort();
        System.out.print("MergeSort: ");
        System.out.println(Arrays.toString(MS.mergeSort(vetor, 0, tamanho - 1)));


    }
}
