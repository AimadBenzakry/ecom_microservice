package com.aimad.ecompaiement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.aimad.ecompaiement.ws.required.facade")
@EnableDiscoveryClient
public class EcomPaiementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomPaiementApplication.class, args);
	}

}
