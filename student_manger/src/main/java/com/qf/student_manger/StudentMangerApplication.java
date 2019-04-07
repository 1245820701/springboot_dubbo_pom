package com.qf.student_manger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class StudentMangerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentMangerApplication.class, args);
    }

}
