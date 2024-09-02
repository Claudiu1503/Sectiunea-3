package guru.springframework.controllers;

import guru.springframework.services.GreetingSericeImpl;
import jakarta.annotation.Priority;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConstructorInjectedControllerTest {


    @Autowired
    ConstructorInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new GreetingSericeImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());

    }
}