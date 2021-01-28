package ua.od.ones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class PeriodicalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeriodicalApplication.class, args);
    }
}