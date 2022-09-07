package com.zhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//注意：@MapperScan注解要导入TK包下的
@MapperScan(basePackages = "com.zhan.Dao")
public class ArtificialaritheletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtificialaritheletApplication.class, args);
    }

}
