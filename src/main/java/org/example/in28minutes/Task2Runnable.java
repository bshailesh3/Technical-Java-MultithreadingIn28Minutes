package org.example.in28minutes;

public class Task2Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2Runnable Started");
       for(int i=200; i<300; i++){
           System.out.println("["+Thread.currentThread()+"] Task2Runnable : ["+i+"]");
       }
        System.out.println("Task2Runnable ended");
    }
}
