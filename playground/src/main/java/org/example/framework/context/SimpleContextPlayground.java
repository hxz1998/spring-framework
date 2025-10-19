/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/12
 **/
package org.example.framework.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleContextPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		AppConfig bean = context.getBean(AppConfig.class);

		System.out.println(bean);

	}

	
}
