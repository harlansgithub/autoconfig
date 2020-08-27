package com.pop.order.config;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pop.order.*")
public class MainConfig {
	@Bean
	public EventBus getEventBus(){
		return new EventBus();
	}
}
