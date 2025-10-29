/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/29
 **/
package org.example.framework.dependency;

import org.springframework.stereotype.Component;

//@Component
public class BeanC {

	private BeanD beanD;

	public BeanC(BeanD beanD) {
		this.beanD = beanD;
	}

	public BeanD getBeanD() {
		return beanD;
	}
}
