package com.BECQx00205619;

import javax.swing.*;

public class Weapon extends ReusableItem {
    private String type;
    private double speed, damage;
    private String wieldType;
    private int level;

    public Weapon(String name, int weight, String description, int remainingUses, String type, double speed, double damage, String wieldType, int level) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.wieldType = wieldType;
        this.level = level;
    }

    public void upgrade(){
        JOptionPane.showMessageDialog(null, "Mejorando caracteristicas...");
        speed++;
        damage++;
        level++;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                ", wieldType='" + wieldType + '\'' +
                ", level=" + level +
                ", remainingUses=" + remainingUses +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
