package me.anukkritshanker;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class account {
    Scanner sc=new Scanner(System.in);
    private String name,phno,accno,city,email;
    double bal;


    public String getAccno() {
        return accno;
    }

    public boolean checkacc(String accno) {
        return this.accno.equals(accno);
    }

    public account(String name, String accno, String phno, String city, String email) {
        this.name = name;
        this.accno = accno;
        this.phno = phno;
        this.city = city;
        this.email = email;
        this.bal = 0;
    }
     boolean checkemail(String email){
         Pattern email_regex=Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
         Matcher m=email_regex.matcher(email);
         return m.find();
         /*for (int a:email.getBytes()) {
            if (email.charAt(a)=='@'||email.charAt(a)=='.')
                return true;
        }
        return false;*/
    }
    void payinterest(){
        Date lipaid= new Date(117,2,23);

        double in=bal*0.06;
        this.bal+=in;
        System.out.println("Interest="+in);
    }
    public void show(){
        System.out.println(toString());
    }
    public void deposit(double d){
        this.bal+=d;
        System.out.println("Money Deposited="+d+"Balance"+bal);
    }
    public boolean withdraw(double w){
        if (bal-w<0)
            return false;
        this.bal-=w;
        System.out.println("Balance ="+this.bal);
        return true;
    }

    public void updateinfo(){
       int choice;
        do {
            System.out.println("1.Name,2.Phno,3.Email,4.City,-1.EXIT");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter name");
                    this.name=sc.nextLine();
                    break;
                case 2:System.out.println("enter Phone no");
                    this.phno=sc.nextLine();
                    break;
                case 3:System.out.println("enter email");
                    this.email=sc.nextLine();
                    break;
                case 4:
                    System.out.println("Enter city");
                    this.city=sc.nextLine();
                    break;
                case -1:
                    System.out.println("EXITED SUCCESSFULLY");
                    break;
                default:
                    System.out.println("Wrong Option");
            }
        }while (choice!=-1);

    }

    @Override
    public String toString() {
        return "account{" +
                "name='" + name + '\'' +
                ", accno='" + accno + '\'' +
                ", phno='" + phno + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", bal=" + bal +
                '}';
    }
}

