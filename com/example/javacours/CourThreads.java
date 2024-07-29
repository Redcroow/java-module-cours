package com.example.javacours;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CourThreads extends Thread {
    /*
        Thread =
            - film d'execution
            - java travaille avec des thread de plateforme
     */

    /*  EXEMPLE 1 ;
        class MyTask implements Runnable {
            public void run() {

            }
        }

        Thread task = new Thread(new MyTask());
        task.start();
     */
    /*  EXEMPLE 2
        public void run() {
            for(int i = 0; i<5 ; i++ ) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args) throws InterruptedException {
            CourThreads ct = new CourThreads();
            CourThreads ct2 = new CourThreads();

            ct.start();
            ct2.start();

            try {
                ct.join();
                ct2.join();
            }catch (InterruptedException e) {}

            System.out.println("TRAITEMENT FINI");
        }
     */
    /*  EXEMPLE 3
            - newSingleThreadExecutor
            - newCachedThreadPool
            - newFixedThredPool
    */
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {}
            }
        };

        Runnable task2 = () -> {
            for (int i = 5; i < 9; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {}
            }
        };

//        executorService.execute(task1);
//        executorService.execute(task2);
        Future<?> future1 = executorService.submit(task1);
        Future<?> future2 = executorService.submit(task2);

        while(!future1.isDone() || !future2.isDone()) {
            System.out.println("En cours...");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {}
        }

        if(future1.isDone() && future2.isDone()) {
            System.out.println("FINISH !!");
        }

        executorService.shutdown();
    }
}
