package lamdas.examples;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing inside Runnable..");
            }
        });
        thread.run();
        Thread thread1 = new Thread(() -> System.out.println("Lambda "));
        thread1.run();

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });
        thread2.start();


    }


}
