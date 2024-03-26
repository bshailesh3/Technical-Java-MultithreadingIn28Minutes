package org.example.in28minutes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableAnyRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService =   Executors.newFixedThreadPool(4);
        List<CallableTask> callableTasksList = new ArrayList<CallableTask>();
        for(int i =0 ;  i < 50 ;i++)  {
            CallableTask callableTask =  new CallableTask("Shailesh "+i);
            callableTasksList.add(callableTask);
        }
        for(int i =0 ;  i < 50 ;i++) {
            String result = executorService.invokeAny(callableTasksList);
            System.out.println(result);
        }



        System.out.println("\nMain method completed");
    }
}
