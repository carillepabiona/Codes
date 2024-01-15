/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movietime;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieTime {

     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        
        String myMovies;
        String mySnacks;
  
        
        // input three movies
        int enter = 3;
        for (int i = 0; i < enter; i++){
            System.out.print("Enter movie " + (i+1) + " of 3: ");
            myMovies = sc.nextLine();
            movies.offer(myMovies);
          
        }
        
        
        //input snack or beverages
        for (int i = 0; i < enter; i++){
            System.out.print("Enter snacks " + (i+1) + " of 3: ");
            mySnacks = sc.nextLine();
            snacks.offer(mySnacks);
        }

        // display movies
        System.out.println("Movies to watch are:  " + movies);
        //display snacks 
        System.out.println("Snacks available are: " + snacks);
        
        
        //finishing snack
        while (enter > 0){
            enter --;
             System.out.println("Press S each time you finish a snack");
             char finish = sc.next().charAt(0);
             snacks.remove();
             if(snacks.isEmpty()){
                 System.out.println("No more Snacks");
             } else {
                System.out.println("Remaining Snacks: " + snacks);
             }
             
        }

    }
}
