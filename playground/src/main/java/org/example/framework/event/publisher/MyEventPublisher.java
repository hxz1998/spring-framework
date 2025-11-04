/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/4
 **/
package org.example.framework.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {

	private Executor executor;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		executor = Executors.newSingleThreadExecutor();
		executor.execute(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						applicationEventPublisher.publishEvent(new MyEvent(this, UUID.randomUUID().toString()));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
}
