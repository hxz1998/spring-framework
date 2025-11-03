/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.aspect;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	public void work() {
		System.out.println("working...");
	}
}
