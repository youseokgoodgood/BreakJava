package com.example.thread;

import java.util.concurrent.*;

/**
 * packageName    : com.example.thread
 * fileName       : CompletableFutureExample
 * author         : wnsgh
 * date           : 2024-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-17        wnsgh       최초 생성
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        completableFutureTest();
    }

    private static void completableFutureTest() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            // CompletableFuture를 사용하여 비동기 작업 수행
            CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
                try {
                    Thread.sleep(2000);  // 2초 동안 작업 수행
                    System.out.println("Task Completed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, executorService);

            // CompletableFuture 작업이 완료될 때까지 대기
            completableFuture.join();  // 이 라인에서 비동기 작업이 완료될 때까지 기다림
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } finally {
            // ExecutorService 종료
            executorService.shutdown();
            if (executorService.awaitTermination(3, TimeUnit.SECONDS)) {
                System.out.println("All tasks completed.");
            } else {
                System.out.println("Timeout: Not all tasks finished in time.");
            }
        }
    }
}
