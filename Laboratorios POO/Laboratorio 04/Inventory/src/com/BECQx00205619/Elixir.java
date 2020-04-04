package com.BECQx00205619;

import javax.swing.*;

public class Elixir extends HealthItem {
    private int amount, time;

    public Elixir(String name, int weight, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    @Override
    public void drink(){
        JOptionPane.showMessageDialog(null, "Tomando el elixir jeje");
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "amount=" + amount +
                ", time=" + time +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
