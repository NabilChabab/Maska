package org.example;

import org.example.controller.MembreController;
import org.example.model.Membre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        context.getBean(MembreController.class);

    }
}
