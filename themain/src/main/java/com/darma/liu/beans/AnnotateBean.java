package com.darma.liu.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class AnnotateBean {
    private int studentId;

    public int getStudentId() {
        System.out.println("get bean");
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
