package Intro;

public class Customer {
    long id;
    String fname;
    String lname;

    public Customer(long id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    public String display(){
        String info =String.format("[Customer: id=%d,fame=%s,lname=%s]",id,fname,lname);
        return info;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1,"Sekhar","Reddy");
        System.out.println(customer.display());
    }
}
