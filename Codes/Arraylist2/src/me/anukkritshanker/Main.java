package me.anukkritshanker;

import java.util.Scanner;

public class Main {
   private static Scanner sc=new Scanner(System.in);
    private static truecaller person1 = new truecaller("7042778760");
    public static void main(String[] args) {
       /*String myno;
        System.out.println("Enter your phone no:");
        myno=sc.nextLine();*/

        addno();
        updatecontact();
        findcontact();
        findname();
        remove();
        printall();

    }
    private static void addno(){
        String name,pno;
        System.out.println("enter name & phone no:");
        name=sc.nextLine();
        pno=sc.nextLine();
        contact newcontact=new contact(name,pno);
        if (person1.addcontact(newcontact))
            System.out.println("Done");
        else
            System.out.println("try again");
    }
    private static int updatecontact()
    { String name,pno;
        System.out.println("enter name & phone no:");
        name=sc.nextLine();
        pno=sc.nextLine();
        contact oldcontact=new contact(name,pno);
        if (person1.findcontactindex(oldcontact)>=0)
        { System.out.println("enter updated info:");
        name=sc.nextLine();
        pno=sc.nextLine();
        contact newcontact=new contact(name,pno);
        person1.updatecontact(oldcontact,newcontact);
        return 0;
        }
        System.out.println("contact not found use add contact");
        return 0;
    }
    private static void findcontact(){
        String name,pno;
        System.out.println("enter name & phone no:");
        name=sc.nextLine();
        pno=sc.nextLine();
        contact contact=new contact(name,pno);
        int pos=person1.findcontactindex(contact);
        if (pos>=0){
            System.out.println("contact found ");
            person1.findcontactshow(pos);
            return ;
        }
        System.out.println("contact not found ");
        return;
    }
    private static void findname(){
        String name;
        System.out.println("enter name & phone no:");
        name=sc.nextLine();
        int pos=person1.findname(name);
        person1.findcontactshow(pos);
    }
    private static void remove(){
        String name,pno;
        System.out.println("enter name & phone no:");
        name=sc.nextLine();
        pno=sc.nextLine();
        contact contact=new contact(name,pno);
        person1.remove(contact);
    }
    private static void printall(){
        for (int i=0;i<person1.noOfcontact();i++)
            person1.findcontactshow(i);

    }
}
