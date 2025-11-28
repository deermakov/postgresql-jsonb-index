package poc.postgres.jsonbindex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "ru.lanit")
@EnableJpaRepositories(value = {"poc.postgres"})
@EntityScan("poc.postgres")
//@EnableTransactionManagement
// непонятно зачем нужно - @EnableEnversRepositories
//@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
