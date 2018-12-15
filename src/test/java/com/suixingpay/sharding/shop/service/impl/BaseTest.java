package com.suixingpay.sharding.shop.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 11:10:11:10
 * @version: V1.0
 * @review:
 */
public class BaseTest {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public ApplicationContext getApplicationContext(){
        return this.applicationContext;
    }
}
