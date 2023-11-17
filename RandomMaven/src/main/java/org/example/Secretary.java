package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Secretary implements Employees {

    private ReportCreator rc;


    @Autowired
    public Secretary(ReportCreator rc) {
        this.rc = rc;
    }

    @Override
    public String getTasks() {
        return "I am managing my boss agenda";
    }

    @Override
    public String getReports() {
        return rc.elaborateReport();
    }
}

