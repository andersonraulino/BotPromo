package com.projebot.promobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromoBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromoBotApplication.class, args);
	}

}

// -------- CÓDIGO PARA FORÇAR O SPRING IGNORAR O BANCO DE DADOS -----------
/*import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PromoBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromobotApplication.class, args);
    }
}*/


/*
package com.projebot.promobot;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PromoBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromoBotApplication.class, args);
    }
}
*/