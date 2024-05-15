package com.sc.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.sc.sbeans")
public class config {
	@Bean(name="ldt")
	public LocalDateTime createLDT()
	{
		return LocalDateTime.now();
	}
}
