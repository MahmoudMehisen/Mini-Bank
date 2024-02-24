package com.mehisen.cards;

import com.mehisen.cards.dto.CardContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.mehisen.cards.controller") })
@EnableJpaRepositories("com.mehisen.cards.repository")
@EntityScan("com.mehisen.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "Mini Bank  Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(name = "Mahmoud Mehisen", email = "mahmoud.mehisen@gmail.com")
        )
)
@EnableConfigurationProperties(value = {CardContactInfoDto.class})
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
