/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/27
 **/
package org.example.framework.post.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
public class AppConfig {
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}

	@Bean(name = "bootstrapExecutor")
	public Executor executor() {
		return Executors.newSingleThreadExecutor();
	}
}
