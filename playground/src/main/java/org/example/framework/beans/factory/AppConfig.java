package org.example.framework.beans.factory;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

	public static class MyFactoryBean implements FactoryBean<String> {

		@Override
		public @Nullable String getObject() throws Exception {
			return "Hello FactoryBean";
		}

		@Override
		public @Nullable Class<?> getObjectType() {
			return String.class;
		}
	}

	@Bean
	public MyFactoryBean myFactoryBean() {
		return new MyFactoryBean();
	}
}
