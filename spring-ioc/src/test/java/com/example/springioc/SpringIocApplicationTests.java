package com.example.springioc;

import com.example.springioc.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringIocApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student.toString());
    }

}
