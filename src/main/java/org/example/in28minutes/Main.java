package org.example.in28minutes;
  public class Main {
    public static void main(String[] args) {
    Task1Thread task1= new Task1Thread();
    task1.start();

    Task2Runnable task2= new Task2Runnable();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();

    }


}

