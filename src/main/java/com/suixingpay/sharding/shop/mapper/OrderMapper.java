package com.suixingpay.sharding.shop.mapper;

import com.suixingpay.sharding.shop.pojo.Order;
import org.apache.ibatis.annotations.Param;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2018/12/13 10:55:10:55
 * @version: V1.0
 * @review:
 */
public interface OrderMapper {

    int insertOrder(Order order);

    Order selectOrderByUserIdAndOrderId(@Param("tcd") String tcd, @Param("orderId") String orderId);
}
