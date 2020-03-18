package com.BECQx00205619;

import java.util.Scanner;

//Realiza un programa que remplace todos los caracteres "a"  por un caracter "b" de una cadena de texto, luego muestra la cadena modificada
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase para realizar los cambios");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        System.out.println(frase.replace('a' , 'b' ));
    }
}
