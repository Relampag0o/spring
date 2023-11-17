package testPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeManagement {
    public EmployeeManagement() {

    }

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Employees jose = context.getBean("SecretaryBeann", Secretary.class);
        System.out.println(jose.getReports());
        context.close();
    }
}