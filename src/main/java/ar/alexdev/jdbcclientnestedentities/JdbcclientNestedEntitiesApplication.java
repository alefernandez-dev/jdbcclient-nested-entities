package ar.alexdev.jdbcclientnestedentities;

import ar.alexdev.jdbcclientnestedentities.repository.ProductH2Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.simple.JdbcClient;

@SpringBootApplication
public class JdbcclientNestedEntitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcclientNestedEntitiesApplication.class, args);
	}

	@Bean
	ProductH2Repository productRepository(JdbcClient jdbcClient) {
		return new ProductH2Repository(jdbcClient);
	}
	@Bean
	CommandLineRunner commandLineRunner(ProductH2Repository productRepository) {
		return args -> {
			productRepository.list().forEach(System.out::println);
		};
	}

}
