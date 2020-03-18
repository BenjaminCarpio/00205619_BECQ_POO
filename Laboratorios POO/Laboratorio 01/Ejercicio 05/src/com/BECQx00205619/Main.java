package com.BECQx00205619;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Realiza un programa que reciba n letras por teclado y almacene en una lista solo las vocales, mayusculas o minusculas
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el total de letras que ingresara: ");

        List<Character> VocalesListaMin = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> VocalesListaMay = Arrays.asList('A', 'E', 'I', 'O', 'U');
        List<Character> VocalesMin = new ArrayList<>();
        List<Character> VocalesMay = new ArrayList<>();
        List<Character> Mayusculas = new ArrayList<>();
        List<Character> Minusculas = new ArrayList<>();

        int total = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese letras 1 por 1");
        for (int i = 0; i < total; i++) {
            char letra = scan.nextLine().charAt(0);
            if (Character.isAlphabetic(letra) && VocalesListaMin.contains(letra))
                VocalesMin.add(letra);
            else if (Character.isAlphabetic(letra) && VocalesListaMay.contains(letra))
                VocalesMay.add(letra);
             else if(Character.isUpperCase(letra))
                Mayusculas.add(letra);
              else
                Minusculas.add(letra);
        }


        System.out.println("Vocales minusculas ingresadas");
        System.out.println(VocalesMin);
        System.out.println("Vocales mayusculas ingresadas");
        System.out.println(VocalesMay);
        System.out.println("Mayusculas ingresadas");
        System.out.println(Mayusculas);
        System.out.println("Minusculas ingresadas");
        System.out.println(Minusculas);
    }
}