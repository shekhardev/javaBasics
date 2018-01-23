package polymorphism.example;

public class Manager extends Employee implements ITrainable, IInterviewer{

    int teamsize;

    public Manager(String name, String address, String phoneNumber, int teamsize) {
        super(name, address, phoneNumber);
        this.teamsize = teamsize;
    }

    @Override
    public void work() {
        System.out.println("I'm a Manager , manges team of" +teamsize);
    }

    @Override
    public void interview() {
        System.out.println("Take interview");
    }

    @Override
    public void train() {
        System.out.println("Get trained by Manager");
    }
}
