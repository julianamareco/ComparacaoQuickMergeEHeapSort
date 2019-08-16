/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3iaa;

/**
 *
 * @author Juliana Mareco Medeiros
 */
public class QuickSort {

    public int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int p = particiona(vetor, inicio, fim); //Pivo
            quickSort(vetor, inicio, p - 1);
            quickSort(vetor, p + 1, fim);
        }
        
        return vetor;
    }

    public static int particiona(int[] vetor, int inicio, int fim) {
        int p = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= p) {
                i++;
            } else if (p < vetor[f]) {
                f--;
            } else {
                int aux = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = aux;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = p;
        return f;
    }

}
