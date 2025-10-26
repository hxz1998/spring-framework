/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/27
 **/
package org.example.framework.post.processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessorPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.framework.post.processor");
		context.getBean("myBean");
	}
}
