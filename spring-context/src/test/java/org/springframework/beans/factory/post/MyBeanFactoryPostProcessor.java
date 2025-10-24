package org.springframework.beans.factory.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 获取指定 bean 的定义
		if (beanFactory.containsBeanDefinition("myService")) {
			BeanDefinition bd = beanFactory.getBeanDefinition("myService");

			// 修改属性值
			bd.getPropertyValues().add("name", "Modified by BeanFactoryPostProcessor");

			System.out.println("Modified bean definition of 'userService'");
		}
	}
}
