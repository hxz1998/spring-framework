/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.framework.configuration;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.framework.configuration");
		AnchorPoint point = context.getBean(AnchorPoint.class);
		System.out.println(point.hello());

	}
}
