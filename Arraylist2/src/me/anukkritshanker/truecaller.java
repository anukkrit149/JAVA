package me.anukkritshanker;

import java.util.ArrayList;

public class truecaller {
    String myno;
    ArrayList<contact> contacts;

    public truecaller(String myno) {
        this.myno = myno;
        this.contacts =new ArrayList<contact>();
    }
    public boolean addcontact(contact addContact){
        if(findcontactindex(addContact)>=0){
            System.out.println("Contact exist");
            return false;
        }
      contacts.add(addContact);
        System.out.println("Contact added successfully");
        return true;
    }
    public boolean updatecontact(contact old,contact newcon){
        int pos= this.contacts.indexOf(old);
        if (pos>=0){
            System.out.println(old.getName()+"Replaced with"+newcon.getName());
            this.contacts.set(pos,newcon);
            return true;
        }
        System.out.println("not found");
        return false;
    }

    public int findcontactindex(contact findContact)
    {
        return this.contacts.indexOf(findContact);
    }
    public void findcontactshow(int pos)
    {
        contact cn=this.contacts.get(pos);
        System.out.println("Contact:"+cn.getName()+"\t"+cn.getPhno());
    }
    public int findname(String nameContact)
    {
        for (int i=0;i<this.contacts.size();i++)
        {
            contact cn=this.contacts.get(i);
            if (cn.getName().equals(nameContact))
                return i;
        }
        return -1;
    }
    public boolean remove(contact rm)
    {
        if (findcontactindex(rm)>=0){
            System.out.println("contact removed ");
            contacts.remove(rm);
            return true;
        }
        System.out.println("contact not found");
        return false;
    }
    public int noOfcontact()
    {
       return this.contacts.size();

    }

}
