package com.BECQx00205619;

import javax.swing.*;

abstract class HealthItem extends Item{
    protected int reuseTime;
    protected String level;
    protected String type;

    public HealthItem(String name, int weight, String description, int reuseTime, String level, String type) {
        super(name, weight, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void drink();
}
