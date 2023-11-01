public class Director extends Boss {
    private double incentive;

    public Director(String name, String lastname, double salary, String department, double incentive) {
        super(name, lastname, salary, department);
        this.incentive = incentive;
    }

    @Override
    public String getTask() {
        return "I am a boss and i earn " + incentive;
    }
}
