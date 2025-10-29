/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/27
 **/
package org.example.framework.post.processor;

import org.example.framework.configuration.BeanB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
@Import(ImportedMyBeanFactoryPostProcessor.class)
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered, BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("修改BeanDefinitionRegistry 外置处理器");
		System.out.println("将所有自定义的 BeanDefinition 修改为异步初始化");
		if (registry instanceof DefaultListableBeanFactory beanFactory) {
			String[] beanNames = registry.getBeanDefinitionNames();
			for (String beanName : beanNames) {
				if (beanName.contains("internal")) {
					System.out.println("内部BeanDefinition，跳过，" + beanName);
					continue;
				}
				if (beanFactory.getMergedBeanDefinition(beanName) instanceof RootBeanDefinition rootBeanDefinition) {
					System.out.println("将[" + beanName + "]修改为异步初始化模式");
					rootBeanDefinition.setBackgroundInit(true);
				}
			}
			beanFactory.registerSingleton("beanB", new BeanB());
		}


	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("修改BeanDefinition属性 外置处理器");
	}

	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}
}
