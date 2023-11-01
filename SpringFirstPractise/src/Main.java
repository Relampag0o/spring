import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class Main {
    public LinkedList<Employee> employees;


    public Main() {
        this.employees = new LinkedList<Employee>();
    }

    public void showTasks() {
        for (Employee e : employees) {
            System.out.println(e.getName() + e.getLastname() + e.getSalary());
            System.out.println(e.getTask());
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        /*
        m.employees.add(new Employee("jose", "rodriguez", 1750));
        m.employees.add(new Director("juan", "rodriguez", 1950, "IT", 400));
        m.employees.add(new Boss("pepe", "rodriguez", 1350, "sales"));
        m.showTasks();
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Employee e1 = context.getBean("employeeGenerator", Employee.class); 
        m.employees.add(e1);
        m.showTasks();
    }
}