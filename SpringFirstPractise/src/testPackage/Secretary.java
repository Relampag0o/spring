package testPackage;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.JavaBean;

@Component("SecretaryBeann")
public class Secretary implements Employees {


    @Override
    public String getTasks() {
        return "I am managing the boss agenda.";
    }

    @Override
    public String getReports() {
        return null;
    }


}
