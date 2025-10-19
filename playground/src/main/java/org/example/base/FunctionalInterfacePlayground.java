/**
 * spring
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/11
 **/
package org.example.base;

public class FunctionalInterfacePlayground {

	public static void main(String[] args) {
		org.example.base.FunctionalInterfacePlayground.Callable callable = new Callable() {
			@Override
			public void call() {
				System.out.println("Hello World");
			}
		};

		callable.call();
	}

	@FunctionalInterface
	interface Callable {

		void call();
	}

	class Engine {

		public void invoke(Callable callable) {
			callable.call();
		}
	}

}
