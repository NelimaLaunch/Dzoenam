package com.optimize.optimizedzoenamcore;

import com.franktech.common.util.CustomResourceBundleMessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.franktech", "com.optimize"})
@EntityScan(basePackages = {"com.franktech", "com.optimize"})
@EnableJpaRepositories(basePackages = {"com.franktech", "com.optimize"})
public class OptimizeDzoenamCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptimizeDzoenamCoreApplication.class, args);
	}

	@Bean
	public MessageSource messageSource() {
		CustomResourceBundleMessageSource messageSource = new CustomResourceBundleMessageSource();
		messageSource.setBasenames("i18n/messages", "i18n/dzoenam/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}
}
