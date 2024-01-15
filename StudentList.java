/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentlist;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList {

   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Map<Integer, String > students = new HashMap<>();

        for (int i = 0; i < 3; i++){
            System.out.print("Enter Student number " + (i+1) + ":");
            int sNumber = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter first name "+ (i+1) + ":");
            String fName = sc.nextLine();
            students.put(sNumber, fName);
        }
       
        System.out.println("Student List: ");
        for(Map.Entry e: students.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
              
        System.out.println("Enter your student number: ");
        int yourSNum = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter your first name: ");
        String yourFName = sc.nextLine();
        students.put(yourSNum, yourFName);
        
        if (students.size() >= 3){
            int eStudent = (int) students.keySet().toArray()[2];
            students.remove(eStudent);
        }
        
        System.out.println("Student List: ");
        for(Map.Entry e: students.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        
    }
}
