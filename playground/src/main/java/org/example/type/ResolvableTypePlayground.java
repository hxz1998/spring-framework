/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/12
 **/
package org.example.type;

import org.springframework.core.ResolvableType;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ResolvableTypePlayground {
	public static void main(String[] args) throws NoSuchFieldException {
		Field field = A.class.getDeclaredField("list");
		ResolvableType type = ResolvableType.forField(field);
		System.out.println(type.resolve());
		System.out.println(Arrays.toString(type.getGenerics()));

	}

	static class A {
		List<String> list;
	}
}
