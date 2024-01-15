/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursionfunction;

import java.util.Scanner;
public class RecursionFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum;
        
        System.out.print("Enter max numbers to display: ");
        maxNum = sc.nextInt();
        
        display_num(1, maxNum);
    }
    
    public static void display_num(int inNum, int maxNum){
        if (inNum <= maxNum){
            System.out.print(inNum);
            if (inNum < maxNum){
                System.out.print(", ");
            }
            display_num(inNum + 1, maxNum);
        }
    }
}
