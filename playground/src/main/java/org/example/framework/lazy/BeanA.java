package org.example.framework.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanA {

	public BeanA() {
		System.out.println("构造了");
	}

	public void hello() {
		System.out.println("hello");
	}
}
