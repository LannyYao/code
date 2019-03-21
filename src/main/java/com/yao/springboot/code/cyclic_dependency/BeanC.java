package com.yao.springboot.code.cyclic_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 3/8/2019 1:43 PM
 */
@Component(value = "beanC")
public class BeanC {

    @Autowired
    private BeanA beanA;

}
