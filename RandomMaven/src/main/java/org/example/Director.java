package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Director implements Employees {

    private ReportCreator rc;

    @Autowired
    public Director(@Qualifier("managerReport") ReportCreator rc) {
        this.rc = rc;
    }

    @Override
    public String getTasks() {
        return null;
    }

    @Override
    public String getReports() {
        return rc.elaborateReport();
    }
}
