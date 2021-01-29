package concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  For IO intensive task make pool size high ( network task like DB call, http call).
 *  For CPU intensive task make pool size as no of CPU.
 */
public class ExecutorServiceFixedThreadPoolDemo {
    public static void main(String args[]){
        //get count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("available Processor: "+ coreCount);
        //
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        // submit the tasks for execution
        for(int i=0; i<100; i++){
            service.execute((new CpuIntensiveTask()));
        }
        service.shutdown();
    }

    static class CpuIntensiveTask implements Runnable {
        @Override
        public void run() {
            //some cpu intensive operations
            System.out.println("Tread: "+ Thread.currentThread().getName() );
        }
    }
}
