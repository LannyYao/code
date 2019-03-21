package com.yao.springboot.code.cyclic_dependency;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 3/8/2019 11:20 AM
 */
@Component(value = "beanB")
@AllArgsConstructor
public class BeanB {

    @Autowired
    private BeanC beanC;

}
