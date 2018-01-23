package porducer.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer_and_Consumer {

    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQue = new ArrayBlockingQueue<>(5);

        Producer producer = new Producer(sharedQue);
        Thread produceThread = new Thread(producer);
        Consumer consumer = new Consumer(sharedQue);

        Thread consumerThread = new Thread(consumer);
        produceThread.start();
        consumerThread.start();
    }
}
