package br.com.tiagogouvea.fundamentos_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.tiagogouvea")
public class FundamentosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringbootApplication.class, args);
	}

}
