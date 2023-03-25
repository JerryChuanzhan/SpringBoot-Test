package com.zcz.hello_world;

import com.zcz.hello_world.pojo.Dog;
import com.zcz.hello_world.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
    }

}
