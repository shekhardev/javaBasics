package polymorphism.example;

public class Programmer extends Employee implements  ITrainable {

    String[] programmingLanguages;

    public Programmer(String name, String address, String phoneNumber, String[] programmingLanguages) {
        super(name, address, phoneNumber);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void work() {
        System.out.println("I'm programmer, I code");
    }

    @Override
    public void train() {
        System.out.println("Get Trained by Programmer!");
    }
}
