/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.greetings;

import java.util.Scanner;
import java.util.PriorityQueue;
public class Greetings {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PriorityQueue <String> nicknames = new PriorityQueue<>();
    
        System.out.println("Input Four(4) nicknames of your classmate" );
        for (int i = 1; i <= 4; i++){
           String nn = sc.nextLine();
           nicknames.add(nn);
        }

        System.out.println("Press 'H' to say Hi to each of them" );
        while (!nicknames.isEmpty()){
            
           char hi = sc.next ().charAt (0);
           if(hi == 'H' || hi == 'h'){
               String nname = nicknames.poll();
               System.out.println("Hi " + nname );
           } else {
                System.out.println("Wrong Letter" );
           }
        }
          System.out.println("Done saying Hi" );
     }
}
