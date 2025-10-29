/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/29
 **/
package org.example.framework.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class BeanF {
	@Autowired
	private BeanE beanE;
//
//	public BeanF(BeanE beanE) {
//		this.beanE = beanE;
//	}
}
