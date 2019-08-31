package me.anukkritshanker;

import java.util.Scanner;

public class Main {
     static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n;
       System.out.println("Enter No of accounts" );
       n=sc.nextInt();
       //account bank[]= new account[n];
       //openacc(bank,n);
       //payinter(bank,n);
       //showall_acc(n,bank);

       //customer cs=new customer();
        student_customer ob1[] = new student_customer[n];
        openacc(ob1,n);
        showall_acc(n,ob1);
        transferfund(ob1[1],ob1[2],400);
    }
    /*test this statement





    static void nstud(int n,student ob[]){
        String name,reg,sec,add;
        for (int i=0;i<n;i++) {
            System.out.println("Enter name,regno,section,add");
            sc.nextLine();
            name=sc.nextLine();
            reg=sc.nextLine();
            sec=sc.nextLine();
            add=sc.nextLine();
            ob[i]= new student(name,sec,reg,add);
            System.out.println("Next->");
        }
    }
    static void showall(int n,student ob[]){
        System.out.println("Show all");
        for (int i=0;i<n;i++)
            System.out.println(ob[i].toString());
    }
    static void feedue(int n,student ob[]){
        System.out.println("Fee Due");
        for (int i=0;i<n;i++)
            if (!ob[i].isFlag())
                System.out.println(ob[i].toString());

    }
    static void feepayement(int n,student ob[]){
        System.out.println("enter registration no:");
        String reg=sc.nextLine();
        for (int i=0;i<n;i++)
            if ((ob[i].getRegno()).equals(reg))
                ob[i].fee_deposit(ob[i]);
            else
                System.out.println("Student Not found");
    }*/

    static void showall_acc(int n,student_customer ob[]){
        System.out.println("Show all");
        for (int i=0;i<n;i++)
            ob[i].show();
    }
    static void openacc(student_customer obj[],int n) {
        for (int i=0;i<n;i++){
        System.out.println("Enter Name,phno,bal");
        String name, phno, city, email;
        double bal;
        sc.nextLine();
        name = sc.nextLine();
        phno = sc.nextLine();
        bal =sc.nextDouble();
        /*city = sc.nextLine();
        email = sc.nextLine();*/
        /*while (obj[i].checkemail(email)) {
            System.out.println("INVALID EMAIL,Renter email");
            email = sc.nextLine();
        }*/
        String acc;
        boolean flag=false;
       do {
           System.out.println("enter account no");
           acc = sc.nextLine();
           for (i = 0; i < n; i++)
               if (obj[i].checkacc(acc)) {
                   System.out.println("account exists,Renter Account No");
                   flag=true;
               }
       }while(flag);
         obj[i] = new student_customer(acc,name,phno,bal);
         System.out.println("Next pls->");

        }
    }
    static void transferfund(student_customer ob1,student_customer ob2,double amt){
        if (!ob1.withdraw(amt))
            System.out.println("insufficient Bal");
        ob2.deposit(amt);
    }
    static void payinter(account ob[],int n){
        for (int i=0;i<n;i++) {
            ob[i].payinterest();
        System.out.println("added in acc:"+ob[i].getAccno()+"bal="+ob[i].bal);
        }
    }
}
