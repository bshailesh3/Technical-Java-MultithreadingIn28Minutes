package org.example.in28minutes;

public class Task1Thread extends Thread {
    @Override
    public void run() {
        System.out.println("Task1Thread Started");
       for(int i=100; i<200; i++){
           System.out.println("["+Thread.currentThread()+"] Task1Thread : ["+i+"]");
       }
        System.out.println("Task1Thread Ended");
    }
}
