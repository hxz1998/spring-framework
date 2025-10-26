/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.framework.dependency;

import org.springframework.stereotype.Component;

@Component
class BeanA {
	private final BeanB beanB;

	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanB getBeanB() {
		return beanB;
	}
}
