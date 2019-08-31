/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package me.anukkritshanker;

public class senior extends customer {
    final double minbal=3000,ir=1;
    public senior(String accno, String name, String phno, double bal) {
        super(accno, name, phno, bal);
    }

    void withdraw(double cash,int minbal) {
        System.out.println("");
        super.withdraw(cash,minbal);
    }

    void pay() {
        super.pay(ir);
    }
}
