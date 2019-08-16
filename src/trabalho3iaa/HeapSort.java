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
public class HeapSort {

    public int[] heapSort(int vetor[], int tamanho) {
        int i = tamanho / 2;
        int pai;
        int filho;
        int j;

        for (int a = 0; i < tamanho; a++) {
            if (i > 0) {
                i--;
                j = vetor[i];
            } else {
                tamanho--;
                j = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = i * 2 + 1;
            while (filho < tamanho) {
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {
                    filho++;
                }
                if (vetor[filho] > j) {
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    break;
                }
            }
            vetor[pai] = j;

        }
        return vetor;
    }
}
