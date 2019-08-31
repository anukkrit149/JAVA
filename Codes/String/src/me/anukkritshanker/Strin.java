package me.anukkritshanker;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

import java.util.Scanner;

public class Strin {
    String name;

    public Strin(String name)                        {
        this.name = name;
    }
    void operations(){

        int choice;
        do {
            System.out.println("1.Uppercase\n2.Lowercase\n3.Substring\n4.Length\n5.Concatenate\n6.Trim\n7.-1 to Return");
            choice=new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println(name.toUpperCase());
                    break;
                case 2:System.out.println(name.toLowerCase());
                    break;
                case 3:
                    System.out.println("Enter first index and last index");
                    int f=new Scanner(System.in).nextInt(),r=new Scanner(System.in).nextInt();
                    System.out.println(name.substring(f,r));
                    break;
                case 4:System.out.println(name.length());
                    break;
                case 5:
                    System.out.println("Enter a String For concatenation");
                    String str=new Scanner(System.in).next();
                    System.out.println(name.concat(str));
                    break;
                case 6:
//                    System.out.println("Enter first index and last index");
//                    int f=new Scanner(System.in).nextInt(),r=new Scanner(System.in).nextInt();
                    System.out.println(name.trim());
                    break;
                default:
                    System.out.println("Wrong Choice Enter choice again");
            }
        }while (choice!=-1);
    }
}
