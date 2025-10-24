package org.springframework.beans.factory.post;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyPostProcessor {

	@Bean
	public PostProcess2 getPostProcess2() {
		return new PostProcess2();
	}

}
