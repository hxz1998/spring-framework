package org.springframework.beans.factory.post;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	private String name;
	public void sayHello() {
		System.out.println("Hello");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
