/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/5
 **/
package org.example.web.context;

import org.eclipse.jetty.ee11.servlet.ServletContextHandler;
import org.eclipse.jetty.ee11.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DirectWebPlayground {
	public static void main(String[] args) throws Exception {
		// 1. 创建 Spring Web 容器
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.scan("org.example.web.context"); // 扫描你的 Controller 包
		context.refresh();

		// 2. 创建 DispatcherServlet（核心调度器）
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		// 3. 嵌入 Jetty（你也可以换成 Tomcat）
		Server server = new Server(8080);
		ServletContextHandler handler = new ServletContextHandler();
		handler.addServlet(new ServletHolder(dispatcherServlet), "/*");
		server.setHandler(handler);

		server.start();
		System.out.println("Server started at http://localhost:8080/");
		server.join();
	}
}
