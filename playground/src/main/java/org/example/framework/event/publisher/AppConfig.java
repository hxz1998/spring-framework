/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/4
 **/
package org.example.framework.event.publisher;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@ComponentScan("org.example.framework.event.publisher")
public class AppConfig {

	@EventListener
	public void onMyEvent(MyEvent event) {
		System.out.println("Method event listener: " + event.getName());
	}
}
