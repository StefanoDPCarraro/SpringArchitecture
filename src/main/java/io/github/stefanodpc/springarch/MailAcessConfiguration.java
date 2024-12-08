package io.github.stefanodpc.springarch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import io.github.stefanodpc.springarch.todos.MailSender;

public class MailAcessConfiguration {
    @Autowired
    private AppProperties properties;

    @Bean
    public void mailSender(){
        System.out.println("Email: " + properties.getEmail());
        System.out.println("Password: " + properties.getPassword());
    }
}
