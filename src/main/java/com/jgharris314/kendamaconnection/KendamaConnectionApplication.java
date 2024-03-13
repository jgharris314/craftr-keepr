package com.jgharris314.kendamaconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class KendamaConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(KendamaConnectionApplication.class, args);
	}

}
