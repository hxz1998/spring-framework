/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.framework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 会导致该类为全代理
@Configuration(proxyBeanMethods = true)
public class BeanA {

	@Bean
	public BeanB beanB() {
		return new BeanB();
	}
}
