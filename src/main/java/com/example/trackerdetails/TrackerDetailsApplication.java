package com.example.trackerdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackerDetailsApplication {
    public static void main(String[] args) {
         System.out.println("MONGO_URI = " + System.getenv("MONGO_URI")); 
        SpringApplication.run(TrackerDetailsApplication.class, args);
    }
}
