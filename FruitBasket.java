/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruitbasket;

import java.util.Scanner;
import java.util.Stack;
public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nFruit;
        char select, eat;

        Stack<String> fruit = new Stack<String>();
        Stack<String> basket = new Stack<String>();

        fruit.push("Guava");
        fruit.push("Mango");
        fruit.push("Orange");
        fruit.push("Apple");
        
        System.out.print("Enter no. of fruits you want to ea. Enter the number 1-4: ");
        nFruit = sc.nextInt();
        System.out.println ("Enter A for Apple, O for Orange, M for Mango, and G for Guava: ");
        if(nFruit > fruit.size()){
            System.out.print("Not enough fruit");
        }
        else{
            for(int i = 1; i <= nFruit; i++){
                System.out.print ("Fruit " + i + " of " + nFruit + ": "); 
                select = sc.next ().charAt (0);

                if(select == 'G' || select == 'g'){
                    basket.push(fruit.pop());
                }
                else if(select == 'M' || select == 'm'){
                    basket.push(fruit.pop());
                }
                else if(select == 'O' || select == 'o'){
                    basket.push(fruit.pop());
                }
                else if(select == 'A' || select == 'a'){
                    basket.push(fruit.pop());
                }
                else{
                    System.out.println ("The selected fruit is not on the top of the basket.\nPlease select another fruit...");
                }
            }
            System.out.println("Your basket has " + basket);
            System.out.println("Press E to eat a fruit: ");

                while(!basket.empty()){
                    eat = sc.next ().charAt (0);
                    if(eat == 'E' || eat == 'e'){
                        basket.pop();
                        System.out.println("Fruit(s) basket: " + basket);
                    }
                    if(basket.empty()){
                        System.out.println("No more fruits.");
                    }
                }
        }
    }
}
