package by.btslogistics.fklservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("by.btslogistics.fklservice.web.rest.proxyfeign")
public class FlkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlkServiceApplication.class, args);
    }

}
