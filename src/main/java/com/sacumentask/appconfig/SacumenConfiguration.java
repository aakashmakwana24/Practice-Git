package com.sacumentask.appconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SacumenConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
