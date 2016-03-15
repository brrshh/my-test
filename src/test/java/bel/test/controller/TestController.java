package bel.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Barys_Shliaha on 3/15/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    String home() {
        return "Hello , it is home page";
    }
}
