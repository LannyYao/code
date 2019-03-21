package com.yao.springboot.code;

import com.yao.springboot.code.cyclic_dependency.BeanA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CodeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(CodeApplication.class, args);

        BeanA beanA = (BeanA)configurableApplicationContext.getBean("beanA");
    }

}
