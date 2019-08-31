package me.anukkritshanker;

import java.util.Scanner;

/***************************************************************************************
 Developed by:
 Anukkrit Shanker
 Copyrights Reserśved
 Topic - Inner Class
 ***************************************************************************************/

public class customer {
    String accno,name,phno;
    static String lastacc;
    double bal;
    Scanner sc=new Scanner(System.in);

    public customer(String accno, String name, String phno,double bal) {
        this.accno = accno;
        this.name = name;
        this.phno = phno;
        this.bal=bal;
    }

    class fd{
       int duration;
       double amt,pi;

        protected fd(int duration, double amt, double pi) {
            this.duration = duration;
            this.amt = amt;
            this.pi = pi;
        }
        void open_fd(){
            System.out.println("open fd,Enter ");
            duration=sc.nextInt();
            amt=sc.nextDouble();
            pi=amt*0.06;
            amt+=pi;
        }

        @Override
        public String toString() {
            return "fd{" +
                    "duration=" + duration +
                    ", amt After returns=" + amt +
                    ", pi=" + pi +
                    '}';
        }
    }
    void show_fd(){
        System.out.println(toString());
    }
    static void update(customer ob){
        lastacc=ob.accno;
    }
    boolean withdraw(double cash,double minbal){
        boolean flag=true;
        while (flag) {
            if (cash > 1000)
                if ((bal - cash) >= minbal) {
                    bal -= cash;
                    System.out.println("Cash withdrawn = " + cash + " Balance left in account=" + bal);
                    return true;
                } else if ((bal - cash) < minbal)
                    System.out.println("insufficient bal");
            else {
                System.out.println("enter amt greater than 1000");
            }

        }
        return false;
    }
    void pay(double ir){
        bal+=(bal*ir/100);
    }

    @Override
    public String toString() {
        return "customer{" +
                "accno='" + accno + '\'' +
                ", name='" + name + '\'' +
                ", phno='" + phno + '\'' +
                ", bal=" + bal +
                ", sc=" + sc +
                '}';
    }
    public boolean checkacc(String accno) {
        return this.accno.equals(accno);
    }
    public void deposit(double d){
        this.bal+=d;
        System.out.println("Money Deposited="+d+"Balance"+bal);
    }

}
