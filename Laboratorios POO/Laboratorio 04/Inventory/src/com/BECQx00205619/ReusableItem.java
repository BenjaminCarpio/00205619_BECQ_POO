package com.BECQx00205619;

abstract class ReusableItem extends Item {
    protected int remainingUses;

    public void reduceUse() {
        //reducir uso xd
    }

    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    public boolean use() {
        return false;//o true XD
    }
}
