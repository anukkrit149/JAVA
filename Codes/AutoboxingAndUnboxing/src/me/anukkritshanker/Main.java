package me.anukkritshanker;
import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bank bk = new bank("State bank of India");

      bk.addbranch("Rohini");
      bk.addcustomer("Rohini","Anukkrit",40000.30);
      bk.addbranch("karol bagh");
      bk.addcustomer("karol bagh","Anukkrit",5000.90);
      bk.addcusTrans("Rohini","Anukkrit",230000.78);
      bk.addcustomer("karol bagh","Chutiya",7000.46);
      bk.addcustomer("Rohini","Lol",569780.09);
      bk.addcusTrans("Rohini","Lol",9877976.89);
      bk.listcustomer("Rohini",true);
      bk.listcustomer("karol bagh",true);
    }
}
