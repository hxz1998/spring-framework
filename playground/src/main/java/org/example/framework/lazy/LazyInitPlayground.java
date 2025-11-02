package org.example.framework.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

public class LazyInitPlayground {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.framework.lazy");
		// 对于懒加载的对象，只有在获取的时候，才会进行构建
		BeanA beanA = context.getBean(BeanA.class);
		beanA.hello();
	}
}
