package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@RestController // Controller: exposes a web address with a url and maps it to your methods
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages={
        "za.ac.cput.controller.SubjectController", "za.ac.cput.DigiLearnCapstone"})

public class
DigiLearnCapstone {

    public static void main (String[] args) {
        SpringApplication.run(DigiLearnCapstone.class, args);
    }
}
