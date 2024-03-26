package org.example.in28minutes;

import java.util.concurrent.*;

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService =   Executors.newFixedThreadPool(10);
        for(int i =0 ;  i < 50 ;i++)  {
            CallableTask callableTask =  new CallableTask("Shailesh "+i);
            Future<String> future = executorService.submit(callableTask);
            System.out.println(future.get());
        }
        System.out.println("\nMain method completed");
    }
}

class CallableTask implements Callable<String> {
    String name;
    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+this.name + ", Thread id - " + Thread.currentThread().getId() ;
    }
}