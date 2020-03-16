package com.BECQx00205619;

import java.util.Scanner;

//Realiza un programa que a traves de un solo for imprima los primeros n terminos de fibonacci
public class Main {

    public static void main(String[] args) {
        System.out.println("Serie de Fibonacci");
        System.out.print("Indique la cantidad de veces que desea repetir la serie: ");
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt(); scan.nextLine();

        int fibo1 = 0;
        int fibo2 = 1;
        int aux = 0;

        for(int i = 0; i < numero; i++){
            System.out.println(fibo1);
            aux = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = aux;
        }
    }
}
