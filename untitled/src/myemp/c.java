package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class c {

    static void print() throws ArithmeticException {
//        ob.print();
        System.out.println(1/0);
    }

    public static void main(String[] args) {
//        a ob1 = new a();
//        a ob2 = new b();
//        b ob3 = new b();
//        print(ob1);
//        print(ob2);
//        print(ob3);
        try {
            print();
            System.out.println("clll");
        }
        catch (ArithmeticException on){
            System.out.println("uhsbdjhfbhs");
        }
        catch (RuntimeException oo){
            System.out.println(oo);
        }
        catch (Exception t){
            System.out.println(t);

        }
    }

}
