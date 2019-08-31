package me.anukkritshanker;

public class student {
    private String name,section,regno,address;
    int fee=6665;
    private boolean flag=false;

    public String getRegno() {
        return regno;
    }

    public boolean isFlag() {
        return flag;
    }

    public student(String name, String section, String regno, String address) {
        this.name = name;
        this.section = section;
        this.regno = regno;
        this.address = address;
    }

    public void fee_deposit(student obj){
        this.flag=true;
        System.out.println("fee deposited for registration no:"+obj.regno);
    }



    @Override
    public String toString() {
        return "student[" +
                "name='" + name + '\'' +
                ", section='" + section + '\'' +
                ", regno='" + regno + '\'' +
                ", address='" + address + '\'' +
                ", fee=" + fee +
                ", flag=" + flag +
                ']';
    }


}
