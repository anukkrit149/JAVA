package me.anukkritshanker;

import java.util.ArrayList;

public class customer {
    private String name;
    private ArrayList <Double> transaction;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
//    Double bal;

    public customer(String name,double intial) {
        this.name = name;
        this.transaction=new ArrayList<Double>();
        addtranaction(intial);
    }
    public void addtranaction(double amt){
        this.transaction.add(amt);
    }
}
