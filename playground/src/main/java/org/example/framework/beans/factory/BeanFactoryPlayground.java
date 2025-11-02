package org.example.framework.beans.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.example.framework.beans.factory");
		Object bean = context.getBean("myFactoryBean");
		Object factoryBean = context.getBean("&myFactoryBean");
		System.out.println();
	}
}
