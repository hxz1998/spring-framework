/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.framework.configuration;

import org.springframework.stereotype.Component;

@Component
public class AnchorPoint {
	private final BeanB beanB;

	public AnchorPoint(BeanB beanB) {
		this.beanB = beanB;
	}

	public String hello() {
		return beanB.getName();
	}
}
