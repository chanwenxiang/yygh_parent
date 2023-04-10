package com.cwx.yygh.hosp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: ServiceHospApplication
 * Package: com.cwx.yygh.hosp
 * Description:
 *
 * @Create: 2023/2/17 - 22:38
 */
@SpringBootApplication
@MapperScan("com.cwx.yygh.hosp.mapper")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class,args);
    }
}
