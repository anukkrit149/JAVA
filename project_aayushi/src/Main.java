import java.util.*;
import java.io.*;

class passenger
{  //outer class containing variables
    static String name;
    static char gen;
    static int age,cno,quota,res,bogie,price,s;
    public passenger()
    {
        name="";
        gen='n';
        age=0;
        cno=0;
        quota=0;
        res=0;
        bogie=0;
        price=0;
        s=0;
    }


    static class details
    { //inner class taking details of the passenger
        public static void entry()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter details 1) NAME 2)GENDER:M/F/TRANS 3)AGE 4)CONTACT NO 5)BOARDING POINT 6)DESTINATION POINT");
            System.out.println("Enter Quota No:- 1). Student-10 2). Disabled-20 3). Senior citizen-15 4). Ladies-10 5). NOTA");
            System.out.println("Enter reservaion mode no: 1). Reservation 2). Tatkal");
            System.out.println(" Select class No: 1). 1st A.C  2). 2nd A.C 3). 3rd A.C 4). General");

            String name=sc.next();
            gen=sc.next().charAt(0);
            age=sc.nextInt();
            cno=sc.nextInt();
            quota=sc.nextInt();
            res=sc.nextInt();
            bogie=sc.nextInt();

            while(age<0||age>110)
            { // to check validity of age
                System.out.println("Invalid age,please re-enter");
                age=sc.nextInt();
            }
            int d=0,c=cno;
            while(d!=10)
            { //to check validity of contact no entered
                d=0;
                while(c!=0)
                {
                    c/=10;
                    d++;
                }
                if(d!=10)
                {
                    System.out.println("Invalid phone number,please enter a valid phone number");
                    cno=sc.nextInt();
                    c=cno;
                }
            }
        }
    }

    static class seat
    {//to reserve seats on basis of user friendly
        public static void berth()
        {

            if(gen=='F' || age>65 ||quota==2)
            {// odd numbered i.e. lower seats for females,disabled and senior citizens
                s=1+(int)(Math.random()*49);
                if(s%2==0)
                    s=s-1;
            }
            else
            {// even numbered upper seats otherwise
                s=1+(int)(Math.random()*48);
                if(s%2!=0)
                    s=s+1;
            }
        }
    }
    static class payprice
    {//

        public static void reserve()
        {// when ticket is booked during the reservation period

            if(bogie==1)
                price=1500;
            if(bogie==2)
                price=1300;
            if(bogie==3)
                price=1200;
            if(bogie==4)
                price=1000;
            if(quota==1 || quota==4)
                price=(price*10)/100;
            else if(quota==2)
                price=(price*20)/100;
            else if(quota==3)
                price=(price*15)/100;
        }
        public static void tatkal()
        {// when ticket is booked during tatkal period

            if(bogie==1)
                price=1800;
            if(bogie==2)
                price=1650;
            if(bogie==3)
                price=1500;
            if(bogie==4)
                price=1200;
            if(quota==1 || quota==4)
                price=(price*10)/100;
            else if(quota==2)
                price=(price*20)/100;
            else if(quota==3)
                price=(price*15)/100;
        }
        public static void print()
        {
            System.out.println("\t"+"TRAIN BERTH MANAGER"+"\t");
            System.out.println("NAME:"+"\t"+name);
            System.out.println("BOGIE TYPE:"+"\t"+bogie);
            System.out.println("BERTH NUMBER:"+"\t"+s);
            System.out.println("GENDER:"+"\t"+gen);
            System.out.println("AGE:"+"\t"+age);
            System.out.println("PHONE NO:"+"\t"+cno);
            System.out.println("HAVE A SAFE TRIP");
        }
    }
}

class mainclass
{
    public static void main()
    {
        System.out.println("WELCOME TO TRAIN BERTH MANAGER");
        passenger pa=new passenger();
        pa.details.entry();
        pa.seat.berth();
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(ch!=1)
        {
            System.out.println("Proceeding to payment.Press 0 to revert back and 1 to continue");
            ch=sc.nextInt();
            if(ch==0)
            {
                System.out.println("Do you wish to opt out or re-enter details? 1 to opt out and 0 to re-enter details.");
                ch=sc.nextInt();
                if(ch==1)
                {
                    System.out.println("THANKS");
                    break;
                }
                else
                {
                    pa.details.entry();
                    pa.seat.berth();
                }
            }
            else if(ch==1)
            {
                if(pa.res==1)
                    pa.payprice.reserve();
                if(pa.res==2)
                    pa.payprice.tatkal();
                pa.payprice.print();
                break;
            }
        }

    }
}











