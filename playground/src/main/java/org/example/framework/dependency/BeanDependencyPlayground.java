/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.framework.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 记录一下Spring是怎样解决Bean之间简单依赖的问题
 */
public class BeanDependencyPlayground {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("org.example.framework.dependency");
		printBeanDefinitionNames(context);
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA.getBeanB());
		System.out.println(context.getBean(BeanB.class));


	}

	public static void printBeanDefinitionNames(ApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}


