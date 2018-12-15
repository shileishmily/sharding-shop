package com.suixingpay.sharding.shop.service.impl;

import com.suixingpay.sharding.shop.mapper.OrderMapper;
import com.suixingpay.sharding.shop.pojo.Order;
import com.suixingpay.sharding.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 10:58:10:58
 * @version: V1.0
 * @review:
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public Order selectOrderByUserIdAndOrderId(String tcd, String orderId) {
        return orderMapper.selectOrderByUserIdAndOrderId(tcd, orderId);
    }
}
