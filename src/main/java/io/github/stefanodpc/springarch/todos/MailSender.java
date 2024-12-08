package io.github.stefanodpc.springarch.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void send(String message){
        System.out.println("Email sent: " + message);
    }
}
