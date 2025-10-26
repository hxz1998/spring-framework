/**
 * spring 
 *
 * @Description: TODO
 * @Author: cherry
 * @Create on: 2025/10/26
 **/
package org.example.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesPlayground {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("H:\\Workspace\\spring-framework\\playground\\src\\main\\java\\org\\example");
		Files.walk(path).forEach(p -> {
			if (Files.isRegularFile(p)) {
				System.out.println("文件：" + p.getFileName().toString());
			} else if (Files.isDirectory(p)) {
				System.out.println("文件夹：" + p.getFileName().toString());
			} else {
				System.out.println(p.getFileName().toString());
			}
		});
	}
}
