package me.anukkritshanker;

import java.util.Scanner;

public class Main {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter 2 no.s");
        a=sc.nextInt();
        b=sc.nextInt();
        calc(a,b);
    }
    public static void square(){
        int sum=0;
        for (int i = 1; i <= 20; i++)
            sum += (i * i);
        System.out.println("Sum of Square 1 to 20="+sum);
    }
    public static int fibo(int n){
        if (n==1 || n==0)
            return 1;
        else
            return fibo(n-2)+fibo(n-1);
    }
    public static void calc(int a, int b){
       do {
           int choice;
           char ch;

           choice=sc.nextInt();
           switch (choice){
               case 1:System.out.println("Sum is "+(a+b));
                   break;
               case 2:System.out.println("Difference is"+(a-b));
                   break;
               case 3:System.out.println("Multiplication is"+(a*b));
                   break;
               case 4:
                   System.out.println("Division is"+(a/b));
                   break;
               case 5:System.out.println("Menu");
                   System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Menu");
                   break;}

           System.out.println("Do u Want to continue?Y/y");
           ch=sc.next();
           }while (ch == Y || ch == y)
       }
    }
}
