/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/21
 **/
package org.example.framework.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextPlayground {

	//	@Component
//	@Profile("id")
	static class HelloComponent {

		public void sayHello() {
			System.out.println("hello");
		}

	}

	public static void main(String[] args) {
		// 通过这个方法创建的，需要显示的注册并刷新
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// 默认是允许的
//		context.setAllowBeanDefinitionOverriding(true);
//		context.setAllowBeanDefinitionOverriding(false);
		context.register(HelloComponent.class);
//		context.register(HelloComponent.class);
		context.refresh();
		HelloComponent component = context.getBean(HelloComponent.class);
		component.sayHello();
	}

}
