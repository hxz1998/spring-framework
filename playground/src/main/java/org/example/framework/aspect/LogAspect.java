/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before("execution(* org.example.framework.aspect.MyService.*(..))")
	public void before() {
		System.out.println("LogAspect before");
	}
}
