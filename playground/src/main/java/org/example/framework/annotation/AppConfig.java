/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	/**
	 * 在扫描BeanDefinition的环节，就已经完成了判定
	 * ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForBeanMethod
	 */
	@Bean
	@Conditional(DevDataSourceCondition.class)
	public MockDataSource dataSource() {
		System.out.println("当前为开发环境，使用开发数据源");
		return new MockDataSource("dev");
	}

	@Bean
	@Conditional(ProdDataSourceCondition.class)
	public MockDataSource prodDataSource() {
		System.out.println("当前为生产环境，使用生产数据源");
		return new MockDataSource("prod");
	}
}
