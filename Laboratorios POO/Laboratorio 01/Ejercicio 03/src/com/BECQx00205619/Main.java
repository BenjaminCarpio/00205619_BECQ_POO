package com.BECQx00205619;

import java.util.Scanner;
//Realice una funcion recursiva que imprima la siguiente secuencia desde 1 hasta n: si n = 3, 1 2 3 2 1
public class Main {

    public static void main(String[] args) {
        System.out.println("Indique hasta que numero se realizara la recursion:  ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        int x = 1;
        int i = 1;  //contador
        Recursive(n, x, i);
    }

    static void Recursive(int n, int x, int i) {
        if (i < n && x < n) {
            System.out.print(x + "  ");
            x++;
            i++;
            Recursive(n, x, i);
        }
        else if(x==n){
            System.out.print(x + "  ");
            x--;
            Recursive(n,x,i);
            i++;
        }
        else if(x < n && x > 0){
            System.out.print(x + "   ");
            x--;
            Recursive(n,x,i);
        }
        else if(x==0)
            return;
    }
}