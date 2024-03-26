package org.example.in28minutes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService =   Executors.newFixedThreadPool(4);
        List<CallableTask> callableTasksList = new ArrayList<CallableTask>();
        for(int i =0 ;  i < 50 ;i++)  {
            CallableTask callableTask =  new CallableTask("Shailesh "+i);
            callableTasksList.add(callableTask);
        }
        List<Future<String>> futures = executorService.invokeAll(callableTasksList);

        for(Future<String> future : futures) {
            System.out.println(future.get());
        }

        System.out.println("\nMain method completed");
    }
}
