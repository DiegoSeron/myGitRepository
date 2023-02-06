/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author diego
 */
public class Receiver implements Runnable {

    private Buffer buffer;

    // standard constructors
    public Receiver(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (String receivedMessage = buffer.receive();
                !"End".equals(receivedMessage);
                receivedMessage = buffer.receive()) {
            System.out.println(receivedMessage);
            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}
