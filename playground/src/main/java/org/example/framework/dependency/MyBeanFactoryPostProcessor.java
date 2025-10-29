/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/29
 **/
package org.example.framework.dependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		if (registry instanceof DefaultListableBeanFactory beanFactory) {
			beanFactory.registerSingleton("beanD", new BeanD());
			System.out.println("提前注入了beanD的实例");
		}
	}
}
