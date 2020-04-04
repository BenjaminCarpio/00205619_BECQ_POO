package com.BECQx00205619;

import javax.swing.*;

public class Potion extends HealthItem {
    private int amount;

    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public void drink(){
        JOptionPane.showMessageDialog(null, "Tomando la posion xd");
    }



    @Override
    public String toString() {
        return "Potion{" +
                "amount=" + amount +
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