package polymorphism.example;

public class MainClass {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Sekhar","add1","1234",new String[]{"Java","ng"});
        programmer.work();
        programmer.train();

        Employee employee = programmer;
        employee.work();

        ITrainable trainable = programmer;
        programmer.train();

    }
}
