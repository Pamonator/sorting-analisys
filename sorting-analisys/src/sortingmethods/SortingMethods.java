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

    private static void swap(int[] vector, int i, int j) {

        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;

    }

}