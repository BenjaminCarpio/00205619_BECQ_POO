package com.BECQx00205619;

public class RegistroTiempo {
    private int HoraEntrada, HoraSalida;

    public RegistroTiempo(){}

    public RegistroTiempo(int horaEntrada) {
        HoraEntrada = horaEntrada;
        HoraSalida = 0;
    }

    public void setHoraEntrada(int horaEntrada) {
        HoraEntrada = horaEntrada;
    }

    public int getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.HoraSalida = horaSalida;
    }

    public int CalcularTiempo(int t1,int t2){
        HoraEntrada=t1;
        HoraSalida=t2;
        int tiempoParqueo = 0;
        tiempoParqueo = HoraSalida - HoraEntrada;
        //JOptionPane.showMessageDialog(null, "ti:" + HoraEntrada + "t2:" + HoraSalida + tiempoParqueo);
        return tiempoParqueo;
    }

}