/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/12
 **/
package org.example.framework.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.framework")
public class AppConfig {
	@Override
	public String toString() {
		return "AppConfigDemo";
	}


}
