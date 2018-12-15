package com.suixingpay.sharding.shop.service.impl;

import com.suixingpay.sharding.shop.pojo.Order;
import com.suixingpay.sharding.shop.service.OrderService;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 11:09:11:09
 * @version: V1.0
 * @review:
 */
public class OrderServiceImplTest extends BaseTest {

    private OrderService orderService = getApplicationContext().getBean("orderService", OrderService.class);
    @Test
    public void insertOrder() {
        Order order = new Order();
        order.setUserId(1);
        order.setOrderId("20181214");
        order.setProductName("测试商品");
        order.setCreateTime(new Date());

        order.setTcd("10000001");
        order.setSysId(1);
        orderService.insertOrder(order);
    }

    @Test
    public void batchInsertOrder() {
    }

    @Test
    public void selectOrderByUserIdAndOrderId() {
        Order order = orderService.selectOrderByUserIdAndOrderId("10000001", "20181214");
        System.out.println(order);
    }
}