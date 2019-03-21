package com.yao.springboot.code.cyclic_dependency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 只要bean创建顺序第一的beanA具有无参构造函数，IOC能解决循环依赖问题
 *
 * @author Lanny Yao
 * @date 3/8/2019 11:20 AM
 */
@Component(value = "beanA")
@Getter
public class BeanA {

    @Autowired
    private BeanB beanB;

    @Override
    public String toString() {
        return "beanA's override toString";
    }
}
