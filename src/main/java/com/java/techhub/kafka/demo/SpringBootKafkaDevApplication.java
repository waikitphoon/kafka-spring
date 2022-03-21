package com.java.techhub.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableKafka
public class SpringBootKafkaDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaDevApplication.class, args);
	}

}
