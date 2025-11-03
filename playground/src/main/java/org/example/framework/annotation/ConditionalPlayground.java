/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.annotation;


import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class ConditionalPlayground {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		ConfigurableEnvironment env = context.getEnvironment();// 创建属性映射
		Map<String, Object> properties = new HashMap<>();
		properties.put("env", "prod"); // 或者 "prod"

		MutablePropertySources sources = env.getPropertySources();
		sources.addFirst(new MapPropertySource("customProperties", properties));

		context.scan("org.example.framework.annotation");
		context.refresh();

		MockDataSource dataSource = context.getBean(MockDataSource.class);
		System.out.println(dataSource.getName());
	}
}
