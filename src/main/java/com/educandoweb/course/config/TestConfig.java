package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRpository userRpository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "junior@gmail.com", "12345");
        User u2 = new User(null, "John", "John@gmail.com", "23456");

        userRpository.saveAll(Arrays.asList(u1, u2));
    }
}
