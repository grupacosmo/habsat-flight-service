package pl.edu.pk.cosmo.habsatbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(servers = {@Server(url = "/")})
public class HabsatBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HabsatBackendApplication.class, args);
    }

}
