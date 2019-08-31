package myemp;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

import java.util.Date;

public class Visit extends customer{

    customer Customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        return productExpense+serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "Customer=" + Customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
