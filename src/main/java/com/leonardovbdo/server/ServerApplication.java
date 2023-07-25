package com.leonardovbdo.server;

import com.leonardovbdo.server.enumeration.Status;
import com.leonardovbdo.server.models.Server;
import com.leonardovbdo.server.repositories.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.leonardovbdo.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(
					new Server(
							null,
							"192.168.1.168",
							"Ubuntu Linux",
							"16 GB",
							"Personal PC",
							"http://localhost:8080/server/image/server1.png",
							SERVER_UP
					)
			);
			serverRepository.save(
					new Server(
							null,
							"192.168.1.58",
							"Fedora Linux",
							"16 GB",
							"Dell Tower",
							"http://localhost:8080/server/image/server2.png",
							SERVER_UP
					)
			);
			serverRepository.save(
					new Server(
							null,
							"192.168.1.21",
							"MS 2008",
							"32 GB",
							"Web Server",
							"http://localhost:8080/server/image/server3.png",
							SERVER_UP
					)
			);
			serverRepository.save(
					new Server(
							null,
							"192.168.1.14",
							"Red Hat Enterprise Linux",
							"64 GB",
							"Mail Server",
							"http://localhost:8080/server/image/server4.png",
							SERVER_UP
					)
			);
		};
	}
}
