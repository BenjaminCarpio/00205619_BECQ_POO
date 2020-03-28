package com.BECQx00205619;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ticket> ListaParqueo = new ArrayList<>();
        RegistroTiempo TiempoRegistro = new RegistroTiempo();
        double gananciasParqueo = 0;
        int opc = 0, hora = 0, salida = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menuDisplay()));

            switch (opc) {
                case 1:
                    String placa = JOptionPane.showInputDialog(null, "Placa: ");
                    hora = Integer.parseInt(JOptionPane.showInputDialog(null, "en formato militar...Ingrese la hora de entrada:"));
                    ListaParqueo.add(new Ticket(placa, hora));
                    TiempoRegistro.setHoraEntrada(hora);
                    break;
                case 2:
                    String SacarAuto = JOptionPane.showInputDialog(null, "Placa del carro que va a salir: ");
                    for (Ticket compara : ListaParqueo) {
                        if (compara.getAutoingresado().equals(SacarAuto)) {

                            salida = Integer.parseInt(JOptionPane.showInputDialog(null, "En formato militar... Ingrese la hora de salida "));
                            int t1 = TiempoRegistro.getHoraEntrada();
                            int t2 = salida;
                            int t3 = TiempoRegistro.CalcularTiempo(t1,t2);
                            double aux = CalculoTotal(t3);
                            gananciasParqueo += aux;
                            ListaParqueo.removeIf(s -> s.getAutoingresado().equals(SacarAuto));
                            JOptionPane.showMessageDialog(null, "Bon voyage!");
                            break;
                        } else
                            JOptionPane.showMessageDialog(null, "No se encontro la placa");
                    }
                    break;
                case 3:
                    String VerTicket = JOptionPane.showInputDialog(null, "Placa: ");
                    if (ListaParqueo.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay tickets");
                    } else {
                        for(Ticket s : ListaParqueo){
                            if(s.getAutoingresado().equalsIgnoreCase(VerTicket));
                            JOptionPane.showMessageDialog(null, s.toString());
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ganancia total del parqueo: $" + gananciasParqueo + "\nSaliendo del programa. . .");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR, ingrese una opcion valida.");
            }
        } while (opc != 4);

    }

    static String menuDisplay() {
        return " 1. Meter carro \n 2. Sacar carro \n 3. Ticket \n 4. Salir\n";
    }

    static double CalculoTotal(int TiempoJeje) {

        double total = 0.0;
        if(TiempoJeje <= 30) {
            total += 0;
            JOptionPane .showMessageDialog(null, "Es Gratis!!");
            return 0;
        } else if (TiempoJeje >= 100 && TiempoJeje < 200) {
            total += 0.50;
            Cobrar(total);
            return 0.50;
        } else if (TiempoJeje >= 200 && TiempoJeje <= 230) {
            total += 1.00;
            Cobrar(total);
            return 1.00;
        } else if (TiempoJeje >= 230) {
            total += 5.00;
            Cobrar(total);
            return 5.00;
        }
        return total;
    }

    static void Cobrar(double total) {
        double valorMoneda;
        double Sumapaga = 0.0, vuelto;

        while (Sumapaga < total) {
            valorMoneda = Float.parseFloat(JOptionPane.showInputDialog("Total a pagar: $"+ total + "\nLLevas: $" + Sumapaga +"\nIngrese monedas 1 por 1(Las denominaciones pueden ser $0.05,$0.10,$0.25,$1.00)"));
            Sumapaga += valorMoneda;
        }
        if (Sumapaga > total) {
            vuelto = Sumapaga - total;
            JOptionPane.showMessageDialog(null, "Su cambio es de: $" + vuelto);
        }
        return;
    }
}