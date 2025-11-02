package org.example.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFuturePlayground {
	public static void main(String[] args) {

		List<CompletableFuture<Integer>> futures = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			final int number = i;
			futures.add(CompletableFuture.supplyAsync(new  Supplier<Integer>() {
				@Override
				public Integer get() {
					try {
						int sleepTime = number * 1000;
						System.out.println("休眠" + sleepTime + "ms");
						Thread.sleep(number * 1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					return number;
				}
			}));
		}
		CompletableFuture.allOf(futures.toArray(new CompletableFuture<?>[0])).join();
		System.out.println("执行完了");
	}
}
