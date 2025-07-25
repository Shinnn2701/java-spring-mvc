package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext hoidanit = SpringApplication.run(DemoApplication.class, args);
		for (String s : hoidanit.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
