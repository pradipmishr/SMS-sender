package com.pradip.emailAndMessageSender;

import com.pradip.emailAndMessageSender.Config.TwilioConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties

public class EmailAndMessageSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailAndMessageSenderApplication.class, args);
	}

}
