package me.anukkritshanker;

import java.util.ArrayList;

public class bank {
    private String namebank;
    private ArrayList<Branch> branch;

    public bank(String namebank) {
        this.namebank = namebank;
        this.branch =new ArrayList<Branch>();
    }
    private Branch findbranch(String namebranch){
        for (int i=0;i<branch.size();i++){
            if (this.branch.get(i).getBranchname().equals(namebranch))
                return this.branch.get(i);
        }
        return null;
    }
    public boolean addbranch(String branchname){
        if(findbranch(branchname)==null){
            this.branch.add(new Branch(branchname));
            return true;
        }
        return false;
    }
    public boolean addcustomer(String branchname,String customername,double amt){
        Branch bc=findbranch(branchname);
        if (bc!=null)
            return bc.newcustomer(customername,amt);

        return false;
    }
    public boolean addcusTrans(String branchname,String customername,double amt){
        Branch bc=findbranch(branchname);
        if (bc!=null){
          return bc.addtransaction(customername,amt);
        }
        return false;
    }
    public boolean listcustomer(String branchname,boolean showtrans){
        Branch bc =findbranch(branchname);
        if (bc!=null){
            System.out.println("details of branch:"+ bc.getBranchname());
            ArrayList<customer> cs=bc.getCustomers();
            for (int i=0;i<bc.getCustomers().size();i++){
                System.out.println((i+1)+". Name:"+cs.get(i).getName());
                if (showtrans){
                    ArrayList<Double> transcations= cs.get(i).getTransaction();
                    System.out.println("Transactions:");
                    for (int j=0;j<transcations.size();j++){
                        System.out.println((j+1)+". Amount:"+transcations.get(j));
                    }
                    System.out.println("************************");
                }
            }
        return true;
        }
        return false;
    }
}
