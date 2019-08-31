package myemp;
/*******************
Project by:
    Anukkrit Shanker
    Copyrights Reserved
 ****************************/


public class PojectManager extends Employee implements Revised{
    int totalproject;
    int totalbugs;


    @Override
    public double reverisal(double per) {

        return 0;
    }

    @Override
    public String toString() {
        return "PojectManager{" +
                "totalproject=" + totalproject +
                ", totalbugs=" + totalbugs +
                ", Empid='" + Empid + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public PojectManager(String empid, String name, double salary, int totalproject, int totalbugs) {
        super(empid, name, salary);
        this.totalproject = totalproject;
        this.totalbugs = totalbugs;
    }
}
