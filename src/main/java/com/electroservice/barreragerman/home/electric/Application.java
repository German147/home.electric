package com.electroservice.barreragerman.home.electric;

import com.electroservice.barreragerman.home.electric.model.Appliance;
import com.electroservice.barreragerman.home.electric.repository.AppliancesRepository;
import com.netflix.discovery.EurekaNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
