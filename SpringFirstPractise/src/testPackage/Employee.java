package testPackage;

public class Employee implements Employees {

    @Override
    public String getTasks() {
        return "Im a simple employee";
    }

    @Override
    public String getReports() {
        return null;
    }
}
