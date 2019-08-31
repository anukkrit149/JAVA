package me.anukkritshanker;

import java.util.Scanner;

public class strbuff {
    StringBuffer name;

    public strbuff(StringBuffer name) {
        this.name = name;
    }
    void operations(){

        int choice;
        do {
            System.out.println("1.Reverse\n2.Capacity\n3.Append\n" +
                            "4.\n" +
                            "5.\n" +
                            "6.\n" +
                            "7.-1 to Return");
            choice=new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    System.out.println(name.reverse());
                    break;
                case 2:System.out.println(name.capacity());
                    break;
                case 3:
                    System.out.println("Enter Append parameter");

                    System.out.println(name.append(new Scanner(System.in)));
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
//                    int f=new Scanner(System.in                     m, ,m.).nextInt(),r=new Scanner(System.in).nextInt();
                    System.out.println(name.trim());
                    break;
                default:
                    System.out.println("Wrong Choice Enter choice again");
            }
        }while (choice!=-1);
    }
}
