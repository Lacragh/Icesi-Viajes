package co.edu.icesi.viajes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class IcesiViajesApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(IcesiViajesApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
    }

}
