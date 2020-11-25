package uk.co.torreon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationLauncher implements CommandLineRunner {
	
	private static final Logger logger = LogManager.getLogger(ApplicationLauncher.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("running java application");
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationLauncher.class, args);
	}

}
