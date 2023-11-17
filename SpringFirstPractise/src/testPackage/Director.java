package testPackage;

public class Director implements Employees {




    @Override
    public String getTasks() {
        return "I am a boss and i dont do anything";
    }

    @Override
    public String getReports() {
        return "This report was create by the director:" ;
    }
}
