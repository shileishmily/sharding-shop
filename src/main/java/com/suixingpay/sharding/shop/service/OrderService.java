package com.suixingpay.sharding.shop.service;

import com.suixingpay.sharding.shop.pojo.Order;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 10:57:10:57
 * @version: V1.0
 * @review:
 */
public interface OrderService {
    int insertOrder(Order order);

    Order selectOrderByUserIdAndOrderId(String tcd, String orderId);
}
