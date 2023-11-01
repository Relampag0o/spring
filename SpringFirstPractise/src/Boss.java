public class Boss extends Employee {
    private String department;

    public Boss(String name, String lastname, double salary, String department) {
        super(name, lastname, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getTask() {
        return "I am responsible of the department " + this.department;
    }
}
