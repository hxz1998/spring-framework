/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/4
 **/
package org.example.framework.event.publisher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

	}
}
