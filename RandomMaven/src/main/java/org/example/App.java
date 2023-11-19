package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employees jose = context.getBean("secretary", Secretary.class);
        Employees joni = context.getBean("director", Director.class);
        System.out.println(joni.getReports());
        context.close();
    }
}
