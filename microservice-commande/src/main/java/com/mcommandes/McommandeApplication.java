package com.mcommandes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
public class McommandeApplication {



	public static void main(String[] args) {
		SpringApplication.run(McommandeApplication.class, args);
	}

}
