package com.mproduits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
public class MproduitApplication {



	public static void main(String[] args) {
		SpringApplication.run(MproduitApplication.class, args);
	}

}
