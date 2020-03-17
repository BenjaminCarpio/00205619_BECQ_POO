package com.BECQx00205619;

import java.util.Scanner;

//Realiza una función que determine si una frase es palindrome o no e imprima el valor de verdad
public class Main {

    public static void main(String[] args) {
        System.out.println("            Verificador de palindromos");

        if (palindromo())
            System.out.println("Es palindromo");
        else
            System.out.println("No es palindromo");

    }

    static boolean palindromo() {
        System.out.println("Ingrese una palabra:");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        boolean EsONoEs = true;
        int fin = frase.length() - 1;
        int ini = 0;
        int tamano = frase.length();
        for (int i = 0; i < tamano; i++) {
            if (frase.charAt(i) != frase.charAt(tamano - i - 1))
                EsONoEs = false;
        }
        return EsONoEs;
    }
}