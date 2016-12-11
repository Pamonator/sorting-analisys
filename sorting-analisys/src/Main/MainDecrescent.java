/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import sortingmethods.SortingMethods;

/**
 *
 * @author a1402072
 */
public class MainDecrescent {

    public static void main(String[] args) {

        int n = 25000;
        int[] vector, vClone1, vClone2, vClone3, vClone4, vClone5, vClone6;
        long begin, end;

        vector = new int[n];

        int j = 0;
        for (int i = (n - 1); i >= 0; i--) {

            vector[j] = i;
            j++;
            //System.out.println(vector[i]);

        }

//        for (int i : vector) {
//            
//            System.out.println(i);
//            
//        }

        vClone1 = vector.clone();
        vClone2 = vector.clone();
        vClone3 = vector.clone();
        vClone4 = vector.clone();
        vClone5 = vector.clone();
        vClone6 = vector.clone();

        //bubble
        begin = System.currentTimeMillis();

        SortingMethods.bubbleSort(vClone1, n);

        end = System.currentTimeMillis();

        System.out.println("Tempo bubble: " + (end - begin));

        //heap
        begin = System.currentTimeMillis();

        SortingMethods.heapSort(vClone2, n);

        end = System.currentTimeMillis();

        System.out.println("Tempo heap: " + (end - begin));

        //shell
        begin = System.currentTimeMillis();

        SortingMethods.shellSort(vClone3, n);

        end = System.currentTimeMillis();

        System.out.println("Tempo shell: " + (end - begin));

        //quick
        try {

            begin = System.currentTimeMillis();
            
            SortingMethods.quickSort(vClone4, 0, (n - 1));

            end = System.currentTimeMillis();

            System.out.println("Tempo quick: " + (end - begin));
            
        } catch (StackOverflowError e) {

            System.out.println(e.getMessage());

        }

//        for (int i = 0; i < n; i++) {
//
//            System.out.println(vClone4[i]);
//
//        }
        //insertion
        begin = System.currentTimeMillis();

        SortingMethods.insertionSort(vClone5, n);

        end = System.currentTimeMillis();

        System.out.println("Tempo insertion: " + (end - begin));

        //merge
        begin = System.currentTimeMillis();

        SortingMethods.mergeSort(vClone6, 0, (n - 1));

        end = System.currentTimeMillis();

        System.out.println("Tempo merge: " + (end - begin));

//        for (int i = 0; i < n; i++) {
//            
//            System.out.println(vector[i]);
//            
//        }
    }

}
