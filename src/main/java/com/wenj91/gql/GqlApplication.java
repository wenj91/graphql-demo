package com.wenj91.gql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wenj91.gql.dao")
public class GqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GqlApplication.class, args);
	}

}
