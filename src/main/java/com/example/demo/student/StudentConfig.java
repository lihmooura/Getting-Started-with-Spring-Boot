package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student Ana = new Student(
					"Ana",
					"ana.silva@gmail.com",
					LocalDate.of(2000, Month.APRIL, 3),
					22
					);
			Student Alex = new Student(
					"Alex",
					"alex@gmail.com",
					LocalDate.of(2002, Month.APRIL, 3),
					22
					);
			repository.saveAll(
					List.of(Ana, Alex)
					);
			
		};
	}
}
