package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Employees jose = context.getBean("secretary", Secretary.class);
    System.out.println(jose.getReports());
    System.out.println(jose.getTasks());
    context.close();  }
}
