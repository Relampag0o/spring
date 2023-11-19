package org.example;

import org.springframework.stereotype.Component;

@Component
public class ManagerReport implements ReportCreator {

    private String id;
    private String body;
    private String date;


    public ManagerReport() {

    }

    public ManagerReport(String id, String body, String date) {
        this.id = id;
        this.body = body;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public String elaborateReport() {
        return "This is a manager report made by someone with power enough to do so!s";
    }
}
