package me.dio.projeto_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto01Application {
	public static void main(String[] args) {
		// Debug das variáveis de ambiente
		System.out.println("PGHOST: " + System.getenv("PGHOST"));
		System.out.println("PGPORT: " + System.getenv("PGPORT"));
		System.out.println("PGDATABASE: " + System.getenv("PGDATABASE"));
		System.out.println("PGUSER: " + System.getenv("PGUSER"));
		System.out.println("PGPASSWORD: " + System.getenv("PGPASSWORD"));

		SpringApplication.run(Projeto01Application.class, args);
	}
}
