package me.anukkritshanker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four values");
        int res_dvi,res_mul,res_add;


        try {
            cal ob = new cal(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            res_mul=ob.mul();
            res_add=ob.add();
            System.out.println("Multiplication:"+res_mul);
            System.out.println("addition:"+res_add);
            res_dvi=ob.a/ob.b;
            System.out.println("division:"+res_dvi);

     }
     catch (InputMismatchException ob){
         System.out.println("Enter Correct value");
     }

        catch (ArithmeticException o){
            System.out.println("Cannot divide by zero");
     }
     finally {

         System.out.println("Program completed");
     }
    }
}
