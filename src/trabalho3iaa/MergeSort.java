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
public class MergeSort {

    public int[] mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            intercalar(v, inicio, meio, fim);
        }
        return v;
    }

    private void intercalar(int[] v, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
        int[] B = new int[n1];
        int[] C = new int[n2];

        for (int i = 0; i < n1; ++i) {
            B[i] = v[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
            C[j] = v[meio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;

        while (i < n1 && j < n2) {
            if (B[i] < C[j]) {
                v[k] = B[i];
                k++;
                i++;
            } else {
                v[k] = C[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            v[k] = B[i];
            k++;
            i++;
        }

        while (j < n2) {
            v[k] = C[j];
            k++;
            j++;
        }

    }
}
