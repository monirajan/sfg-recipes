package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"guru.springframework.domain"})  // scan JPA entities
public class SfgRecipesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgRecipesApplication.class, args);
    }

}
