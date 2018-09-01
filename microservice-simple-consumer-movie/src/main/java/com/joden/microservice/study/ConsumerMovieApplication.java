package com.joden.microservice.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerMovieApplication {
	
	/**
	 * {@link Bean} 是一个方法注解，作用是实例化一个 Bean 并使用该方法的名称命名。
	 * <p>
	 * 这里等价于 <pre> RestTemplate restTemplate = new RestTemplate(); </pre>
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieApplication.class, args);
	}
}
