package com.appdemo.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dcabrera.utils.logging.loggingUtil.Logger;
import com.dcabrera.utils.logging.loggingUtil.LoggerFactory;
import com.dcabrera.utils.logging.loggingUtil.LoggerType;

@SpringBootApplication
public class UserPortalApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);

	}
}
