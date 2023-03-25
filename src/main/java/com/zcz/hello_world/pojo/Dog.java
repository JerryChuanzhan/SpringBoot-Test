package com.zcz.hello_world.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: //TODO
 * @ClassName: Dog
 * @Author: ZCZ
 * @Date 2023年03月24日 0:44
 **/
@Component
public class Dog {
    @Value("蹦蹦")
    private String name;
    @Value("3")
    private String age;

    public Dog() {
    }

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
