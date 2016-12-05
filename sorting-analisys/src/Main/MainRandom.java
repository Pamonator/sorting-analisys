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
public class MainRandom {
    
    
    public static void main(String[] args) {
        
        int n = 1000;
        int[] vector;
        long begin, end;

        vector = new int[n];

        
        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * n) + 1;
            //System.out.println(vector[i]);

        }

        begin = System.currentTimeMillis();

        SortingMethods.bubbleSort(vector, n);

        end = System.currentTimeMillis();

        System.out.println("Tempo de ordenação: " + (end - begin));
        
//        for (int i = 0; i < n; i++) {
//            
//            System.out.println(vector[i]);
//            
//        }
        
        
    }
    
}
