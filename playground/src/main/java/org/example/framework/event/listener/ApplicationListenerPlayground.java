/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/27
 **/
package org.example.framework.event.listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationListenerPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.framework.event.listener");
		context.publishEvent(new MyEvent("", "hello"));
		context.close();
	}
}
