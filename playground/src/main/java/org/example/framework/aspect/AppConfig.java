/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/2
 **/
package org.example.framework.aspect;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
// 这个注解，Import进来了一个AspectJAutoProxyRegistrar
@EnableAspectJAutoProxy
public class AppConfig {

}
