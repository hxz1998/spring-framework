/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/21
 **/
package org.example.framework.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class BeanInfoPlayground {

	static class Person {
		private String name;
		private int age;

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);

		for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
			System.out.println(pd.getName());
		}

	}
}
