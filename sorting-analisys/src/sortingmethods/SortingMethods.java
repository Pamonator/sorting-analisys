/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmethods;

/**
 *
 * @author a1402072
 */
public class SortingMethods {

    public static void bubbleSort(int[] vector, int n) {

        boolean swaped = true;

        int i = n - 1;

        while (swaped) {

            swaped = false;

            for (int j = 0; j < i; j++) {

                if (vector[j] > vector[j + 1]) {

                    swaped = true;
                    swap(vector, j, j + 1);

                }

            }

            i--;

        }

    }

    public static void insertionSort(int[] vector, int n) {

        int temp;

        for (int i = 1; i < n; i++) {

            temp = vector[i];

            for (int j = i - 1; j >= 0 && temp < vector[j]; j--) {

                vector[j + 1] = vector[j];
                vector[j] = temp;

            }

        }

    }

    public static void mergeSort(int[] vector, int start, int end) {

        if (start < end) {

            int half = (start + end) / 2;

            mergeSort(vector, start, half);
            mergeSort(vector, (half + 1), end);
            merge(vector, start, half, end);

        }

    }

    private static void merge(int[] vector, int start, int half, int end) {

        int[] aux = new int[end + 1];

        //copiando o trecho do vetor a ser ordenado
        for (int i = start; i <= end; i++) {

            aux[i] = vector[i];

        }

        //indices auxiliares
        int i = start;
        int j = half + 1;
        int k = start;

        //junção das listas ordenadas
        while (i <= half && j <= end) {

            if (aux[i] < aux[j]) {

                vector[k] = aux[i];
                i++;

            } else {

                vector[k] = aux[j];
                j++;

            }

            k++;

        }

        //inclusão dos itens que não entraram na junção das listas ordenadas
        while (i <= half) {

            vector[k] = aux[i];
            i++;
            k++;

        }

        //inclusão dos itens que não entraram na junção das listas ordenadas
        while (j <= end) {

            vector[k] = aux[j];
            j++;
            k++;

        }

    }

    public static void heapSort(int[] vector, int n) {

        int i = n / 2;
        int father, son, temp;

        for (;;) {

            if (i > 0) {

                i--;
                temp = vector[i];

            } else {

                n--;
                if (n == 0) {
                    return;
                }
                temp = vector[n];
                vector[n] = vector[0];

            }

            father = i;
            son = (i * 2) + 1;

            while (son < n) {

                if ((son + 1) < n && (vector[son + 1] > vector[son])) {

                    son++;

                }

                if (vector[son] > temp) {

                    vector[father] = vector[son];
                    father = son;
                    son = (father * 2) + 1;
                } else {

                    break;

                }

            }

            vector[father] = temp;

        }

    }

    public static void shellSort(int[] vector, int n) {

        int aux = 1;

        while (aux < n) {

            aux = (aux * 3) + 1;

        }

        aux /= 3;

        int temp, j;

        while (aux > 0) {

            for (int i = aux; i < n; i++) {

                temp = vector[i];
                j = i;

                while (j >= aux && vector[j - aux] > temp) {

                    vector[j] = vector[j - aux];
                    j = j - aux;

                }

                vector[j] = temp;

            }

            aux /= 2;

        }

    }

    public static void quickSort(int[] vector, int left, int right) {

        int i = left;
        int j = right;
        
        int pivot = vector[left + ((right - left) /2)];
        
        while (i <= j) {
            
            while (vector[i] < pivot) {
                
                i++;
                
            }
            
            while (vector[j] > pivot) {

                j--;
                
            }
            
            if (i <= j) {
                
                swap(vector, i, j);
                i++;
                j--;                        
                
            }
            
            if (left < j) {
                
                quickSort(vector, left, j);
                
            }
            
            if (i < right) {
                
                quickSort(vector, i, right);
                
            }
            
        }

    }

    private static void swap(int[] vector, int i, int j) {

        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;

    }

}
