package ua.od.ones.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static  Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/login")
    public String login() {
        logger.info("*********************");
        logger.info("login endpoint called");
        logger.info("*********************");
        return "Loggin in...";
    }

}
