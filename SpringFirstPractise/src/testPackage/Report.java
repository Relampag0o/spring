package testPackage;

public class Report implements ReportsCreator{
    @Override
    public String getReport() {
        return "This is the report presentation!";
    }
}
