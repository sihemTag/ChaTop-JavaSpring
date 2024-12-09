package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class RentalsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalsAppApplication.class, args);
        System.out.println("hello");

    }

}