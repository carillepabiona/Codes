/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myarray1;

import java.util.Arrays;
import java.util.ArrayList;
public class MyArrays1 {
public static void main(String[] args) {
        
        Integer arrayA[] = {15,30,45,55,70};
        int arlen = arrayA.length;
        //arrayA[arlen - 1] = 20;
        
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(arrayA));
        arr.add(100);
        
       
        for (int i = 0; i <= arlen; i++) {
            System.out.println( arr.get(i) );
        }
        
    }
}
