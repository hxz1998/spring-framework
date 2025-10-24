package org.springframework;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class RefreshableApplicationContextPlayground {

	public static void main(String[] args) {
		AnnotationConfigWebApplicationContext context =
//				new GenericApplicationContext();
				new AnnotationConfigWebApplicationContext();
		context.refresh();
		context.refresh();
	}
}
