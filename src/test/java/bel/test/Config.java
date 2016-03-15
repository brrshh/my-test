package bel.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Barys_Shliaha on 3/15/2016.
 */
@EnableAutoConfiguration
@RestController
public class Config {

    @RequestMapping("/")
    String home() {
        return "Hello , it is home page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }

}
