package com.BECQx00205619;

abstract class Item {
    protected int ID;
    protected String name;
    protected int weight;
    protected String description;

    public Item(){}

    public int getID() {
        return ID;
    }



    public Item(String name, int weight, String description) {
        this.ID = IdGenerator.newId();
        this.name = name;
        this.weight = weight;
        this.description = description;
    }

}
