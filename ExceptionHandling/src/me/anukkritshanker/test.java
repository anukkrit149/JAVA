package me.anukkritshanker;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */


public class test {

    public static void main(String[] args) {
        try {
//            System.out.println("Method : value"+meth());
            meth();
        } catch (ArithmeticException e) {
             System.out.println("ArithmeticException caught");
         }
//         catch (Exception oo){
//            System.out.println("Exception");
//        }
        finally {
            System.out.println("Outer finally");
        }
    }

    public static void meth() {
        try {
            int res = 3 / 1;
            throw new NullPointerException("Helf");
        } finally {
            System.out.println("Finally in meth");
        }

    }
}