package polymorphism.example;

abstract class Employee {

    String name;
    String address;
    String phoneNumber;

    public Employee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public abstract void work();
}
