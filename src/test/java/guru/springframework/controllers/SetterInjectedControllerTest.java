package guru.springframework.controllers;

import guru.springframework.services.GreetingSericeImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

//    @BeforeEach
//    void setUp() {
//
//        setterInjectedController = new SetterInjectedController();
//        setterInjectedController.setGreetingSerice(new GreetingSericeImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}