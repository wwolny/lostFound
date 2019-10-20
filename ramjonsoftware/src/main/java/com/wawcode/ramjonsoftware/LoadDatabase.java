package com.wawcode.ramjonsoftware;

import com.wawcode.ramjonsoftware.entity.EventRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

//  @Bean
//  CommandLineRunner initDatabase(EventRepository repository) {
//    return args -> {
//      log.info("Preloading " + repository.save(
//    		  new Event("Zibi", "Pizza!", "Burger x3 + Pizza Mala",
//    				  new java.sql.Timestamp(System.currentTimeMillis()),
//    				  52.230292, 21.010541
//    		  )));
//      log.info("Preloading " + repository.save(
//    		  new Event("Adam", "Ławka", "Zielona",
//    				  new java.sql.Timestamp(System.currentTimeMillis()),
//    				  52.229175, 21.006303)));
//    };
//  }
}