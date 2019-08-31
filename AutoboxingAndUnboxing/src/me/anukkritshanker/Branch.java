package me.anukkritshanker;

import java.util.ArrayList;

public class Branch {
    private String branchname;
    private ArrayList<customer> customers;

    public String getBranchname() {
        return branchname;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

    public Branch(String name) {
        this.branchname = name;
        this.customers = new ArrayList<customer>();

    }
    private customer findcustomer(String name){
        for (int i=0;i<this.customers.size();i++){
            if (this.customers.get(i).getName().equals(name))
                return this.customers.get(i);
        }
        return null;
    }

    public boolean newcustomer(String name, double amt ){
        if(findcustomer(name)==null){
            this.customers.add(new customer(name,amt));
            return true;
        }
        return false;
    }
    public boolean addtransaction(String name,double amt){
        customer cs = findcustomer(name);
        if (cs!=null){
            cs.addtranaction(amt);
            return true;
        }
        return false;
    }


}
