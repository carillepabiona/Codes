/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app;

import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class App {

    public static void main(String[] args) {
        
        Queue book = new LinkedList <String>();
        Stack <String> title = new Stack <>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four book titles: ");
        
        int  bookS = 4;
        for(int i=1; i <= bookS;i++){
            System.out.print("Book " + i + ": ");
            String Enter = sc.nextLine();
            title.push(Enter);
        }
        for(int i=1; i <= bookS; i++){
            book.offer(title.pop());
        }
        System.out.println("New order of books:");
        System.out.println(book);
    }
}
