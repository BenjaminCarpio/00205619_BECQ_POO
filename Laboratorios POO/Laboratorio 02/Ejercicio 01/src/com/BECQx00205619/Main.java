package com.BECQx00205619;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<HerramientasMinecraft> ToolList = new ArrayList<>();
        String tipo = " ", material = " ";
        int durabilidad = 0, dps = 0, ataque = 0, aux1 = 0, aux2 = 0, aux3 = 0;
        boolean continuar = true;

        do {
            System.out.println("\t\tMenu");
            System.out.println("1) Agregar herramientas");
            System.out.println("2) Ver todas las herramientas");
            System.out.println("3) Ver herramientas por su tipo");
            System.out.println("4) Mejorar arma");
            System.out.println("5) Atacar");
            System.out.println("6) Cerrar");
            aux1 = scan.nextInt();
            scan.nextLine();

            switch (aux1) {
                case 1:
                    System.out.println("\t\tTipo de herramienta:");
                    System.out.println("1) Hacha");
                    System.out.println("2) Pico");
                    System.out.println("3) Espada");
                    System.out.println("4) Pala ");
                    System.out.println("5) Guadana ");
                    aux2 = scan.nextInt();
                    scan.nextLine();
                    switch (aux2) {
                        case 1:
                            tipo = "Hacha";
                            break;
                        case 2:
                            tipo = "Pico";
                            break;
                        case 3:
                            tipo = "Espada";
                            break;
                        case 4:
                            tipo = "Pala";
                            break;
                        case 5:
                            tipo = "Guadana";
                            break;
                    }
                    System.out.println("\t\tMaterial:");
                    System.out.println("1) Diamante");
                    System.out.println("2) Oro");
                    System.out.println("3) Piedra");
                    System.out.println("4) Madera");
                    aux3 = scan.nextInt();
                    scan.nextLine();
                    switch (aux3) {
                        case 1:
                            material = "Diamante";
                            break;
                        case 2:
                            material = "Oro";
                            break;
                        case 3:
                            material = "Piedra";
                            break;
                        case 4:
                            material = "Madera";
                            break;
                        default:
                            System.out.println("Invalid number");
                    }
                    System.out.print("Durabilidad: ");
                    durabilidad = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Dps: ");
                    dps = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Ataque: ");
                    ataque = scan.nextInt();
                    scan.nextLine();
                    ToolList.add(new HerramientasMinecraft(tipo, material, ataque, durabilidad, dps));
                    break;

                case 2:
                    ToolList.forEach(System.out::println);
                    break;

                case 3:
                        if(ToolList.size()==0){
                            System.out.println("No se encuentran Herramientas");
                            System.out.println("Añada Herramientas\n");
                        }else{
                            System.out.print("Digite el Tipo: "); tipo = scan.nextLine();
                            String tipoAgain = tipo;
                            for(int i=0; i<ToolList.size(); i++){
                                if(ToolList.get(i).getTipo().equals(tipoAgain)){
                                    ToolList.get(i).mostrardatos();
                                }
                            }
                        }
                        break;
                case 4:
                    ToolList.forEach(s -> {
                        s.MejorarHerramienta();
                    });
                    break;

                case 5:
                    ToolList.forEach(s -> {
                        s.Atacar();
                    });
                    break;
                case 6:
                    continuar = false;
            }
        } while (continuar);
    }
}

