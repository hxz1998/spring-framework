/**
 * spring
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/11/5
 **/
package org.example.web.context;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(@RequestParam(defaultValue = "world") String name) {
		return "Hello " + name;
	}
}
