package com.BECQx00205619;

import javax.swing.*;

public class Ammo extends ReusableItem {
    private boolean equipped;

    public Ammo(String name, int weight, String description, int remainingUses, boolean equipped) {
        super(name, weight, description, remainingUses);
        this.equipped = equipped;
    }

    public void equip(){
        JOptionPane.showMessageDialog(null, "Equipando jeje");
        equipped = true;
    }

    public boolean isEquipped() {
        return equipped;
    }

    @Override
    public String toString() {
        return "Ammo{" +
                "equipped=" + equipped +
                ", remainingUses=" + remainingUses +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
