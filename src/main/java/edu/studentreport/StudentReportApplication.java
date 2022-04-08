package edu.studentreport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.studentreport.dao")
@SpringBootApplication
public class StudentReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentReportApplication.class, args);
    }

}
