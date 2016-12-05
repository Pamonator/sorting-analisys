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
        
        int n = 100000;
        int[] vector;
        long begin, end;

        vector = new int[n];

        
        for (int i = (n - 1); i >= 0; i--) {

            vector[i] = i;
            //System.out.println(vector[i]);

        }

        begin = System.currentTimeMillis();

        SortingMethods.quickSort(vector, 0, (n - 1));

        end = System.currentTimeMillis();

        System.out.println("Tempo de ordenação: " + (end - begin));
        
//        for (int i = 0; i < n; i++) {
//            
//            System.out.println(vector[i]);
//            
//        }
//        
        
    }
    
}
