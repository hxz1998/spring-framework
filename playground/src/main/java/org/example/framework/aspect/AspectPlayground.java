/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.aspect;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.example.framework.aspect");
		MyService service = context.getBean(MyService.class);
		service.work();
	}
}
