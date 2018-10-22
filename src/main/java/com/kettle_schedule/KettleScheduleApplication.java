package com.kettle_schedule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.kettle_schedule.**.mapper"})
@ServletComponentScan
public class KettleScheduleApplication {


    public static void main(String[] args) {
        SpringApplication.run(KettleScheduleApplication.class, args);
    }
}
