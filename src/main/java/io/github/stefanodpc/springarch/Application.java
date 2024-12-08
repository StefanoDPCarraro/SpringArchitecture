package io.github.stefanodpc.springarch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		// builder.lazyInitialization(true); -- Makes all the beans lazy by default.
		builder.run(args);
		ConfigurableApplicationContext applicationContext = builder.context();
		// var productRepository = applicationContext.getBean("produtoRepository");
		// ConfigurableEnviroment enviroment = applicationContext.getEnviroment();
		// String applicationName = enviroment.getProperty("spring.application.name");
		ValueExample valueExample = applicationContext.getBean(ValueExample.class);
		valueExample.printVar();
	}

}
