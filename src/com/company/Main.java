package com.company;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        //Získavanie výšky trojuholníkov od použivaťela
        System.out.print("Zadaj číslo:");
        Scanner input_scan = new Scanner(System.in);
        String input = input_scan.nextLine();
        int vyska = parseInt(input);

        //Printovanie originálneho trojuholníka
        for (int i = 0; i <= vyska; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Oddelenie trojuholníkov
        System.out.println();
        System.out.println("|----|");
        System.out.println();

        //Printovanie mirrornutého trojuholníka
        for (int i = 1; i <= vyska; i++){
            for (int j = 1; j <= vyska - i; j++){
                System.out.print(" ");
            }
            for (int y = 0; y < i; y++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Oddelenie trojuholníkov
        System.out.println();
        System.out.println("|----|");
        System.out.println();

        //Printovanie flipnutého trojuholníka
        for (int i = 0; i <= vyska; i++){
            for (int j = 0; j < vyska - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Oddelenie trojuholníkov
        System.out.println();
        System.out.println("|----|");
        System.out.println();

        //Printovanie trojuholníka otočené
        for (int i = 1; i <= vyska; i++){
            for (int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for (int y = 0; y <= vyska - i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}