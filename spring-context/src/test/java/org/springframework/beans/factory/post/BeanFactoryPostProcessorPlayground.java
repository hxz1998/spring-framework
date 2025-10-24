package org.springframework.beans.factory.post;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorPlayground {
	public static void main(String[] args) throws InterruptedException {
		test2();
	}

	public static void test1() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("org.springframework.beans.factory.post");
		Object obj = context.getBean("myService");
	}

	public static void test2() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("org.springframework.beans.factory.post");
		Object obj = context.getBean("myService");
	}
}
