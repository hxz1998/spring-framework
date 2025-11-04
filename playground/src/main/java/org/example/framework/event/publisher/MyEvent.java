/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/4
 **/
package org.example.framework.event.publisher;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7099057708183571937L;

	private final String name;
	public MyEvent(Object source, String name) {
		super(source);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
