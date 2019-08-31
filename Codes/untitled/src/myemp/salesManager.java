package myemp;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class salesManager extends Employee implements Revised {
    int totalSales=0;

    @Override
    public double reverisal(double per) {
        return 0;
    }

    public salesManager(int totalSales) {
        this.totalSales = totalSales;
    }

    public salesManager(String empid, String name, double salary, int totalSales) {
        super(empid, name, salary);
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "salesManager{" +
                "totalSales=" + totalSales +
                ", Empid='" + Empid + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
