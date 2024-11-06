package com.example.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * packageName    : com.example.thread
 * fileName       : ResourceCleanupExample
 * author         : wnsgh
 * date           : 2024-11-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-05        wnsgh       최초 생성
 */
public class ResourceCleanupExample {
    public static void processTasks(List<String> pnuList) {
        int numCores = Runtime.getRuntime().availableProcessors(); // Get number of CPU cores
        int optimalThreadCount = Math.min(pnuList.size(), numCores * 2); // Adjust thread count based on tasks size and cores
        ExecutorService executorService = Executors.newFixedThreadPool(optimalThreadCount);
        ForkJoinPool customThreadPool = new ForkJoinPool(10);
        List<Future<?>> futures = new ArrayList<>();

        // Add a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook triggered. Shutting down services...");
            executorService.shutdown();
            customThreadPool.shutdown();
            try {
                if (!executorService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                    System.out.println("Forcing executor shutdown...");
                    executorService.shutdownNow();
                }
                if (!customThreadPool.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                    System.out.println("Forcing ForkJoinPool shutdown...");
                    customThreadPool.shutdownNow();
                }
            } catch (InterruptedException e) {
                System.out.println("Shutdown interrupted.");
                executorService.shutdownNow();
                customThreadPool.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }));

        try {
//            for (String s : pnuList) {
//                Future<?> future = executorService.submit(() ->{
//                    processTask(s);
//                });
//
//                futures.add(future);
//            }
//
//            for (Future<?> future : futures) {
//                future.get();
//            }

            customThreadPool.submit(() ->
                    pnuList.parallelStream()
                            .map(task -> CompletableFuture.runAsync(() -> processTask(task), executorService))
                            .collect(Collectors.toList()) // Collect all futures
            ).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            customThreadPool.shutdown();
        }
    }

    private static void processTask(String task) {
        System.out.println("Processing task: " + task);
        // Simulated processing logic
    }

    public static void main(String[] args) {
        List<String> pnuList = new ArrayList<>();
        // Populate the list with tasks
        // pnuList.add(...);

        for (int i = 0; i < 1884; i++) {
            pnuList.add(String.valueOf(i));
        }


        processTasks(pnuList);
    }

}
