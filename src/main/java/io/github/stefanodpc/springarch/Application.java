package io.github.stefanodpc.springarch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		// ConfigurableApplicationContext applicationContext = builder.context();
		// var productRepository = applicationContext.getBean("produtoRepository");
		// ConfigurableEnviroment enviroment = applicationContext.getEnviroment();
		// String applicationName = enviroment.getProperties("spring.application.name");
		builder.run(args);
	}

}
