/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package me.anukkritshanker;

public class student_customer extends customer {
    final double minbal,ir=0.5;
    static int i=1;
    public student_customer(String accno, String name, String phno, double bal) {
        super(accno, name, phno, bal);
        minbal=0;
    }


    boolean withdraw(double cash) {
        if (super.withdraw(cash,minbal))
            return true;
        return false;

    }

    void pay() {
        super.pay(ir);
    }
    void incr(){
        i++;
    }
    void show(){
        System.out.println(super.toString());
    }

}
