package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        
        User user = new User();
        user.setFirstName("Neha");
        user.setCity("Chandigarh");
        user.setPersonStatus("I am a java coder");
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }
}
