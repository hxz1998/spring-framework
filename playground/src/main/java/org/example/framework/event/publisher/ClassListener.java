/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/4
 **/
package org.example.framework.event.publisher;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ClassListener implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("ClassListener onApplicationEvent：" + event.getName());
	}
}
