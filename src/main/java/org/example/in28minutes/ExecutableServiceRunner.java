package org.example.in28minutes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutableServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task1Thread());
        executorService.execute(new Thread(new Task2Runnable()));
    }
}
