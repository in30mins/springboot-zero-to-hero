package com.in30mins;

import com.in30mins.entity.Alian;
import com.in30mins.repo.SpringbootJdbc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);

		Alian alian = context.getBean(Alian.class);
		alian.setId(121);
		alian.setName("Ramu");
		alian.setTech("AI");

		SpringbootJdbc alianRepo = context.getBean(SpringbootJdbc.class);
		alianRepo.save(alian);

		System.out.println(alianRepo.findAll());
	}

}
