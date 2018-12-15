package com.suixingpay.sharding.shop.algorithm;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.MultipleKeysTableShardingAlgorithm;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * user_id，order_id路由
 */
public class MyMultipleKeysTableShardingAlgorithm implements MultipleKeysTableShardingAlgorithm {

    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final Collection<ShardingValue<?>> shardingValues) {
        Set<String> tcdValueSet = this.<Date>getShardingValue(shardingValues, "tcd");
        Set<String> orderIdValueSet = this.<Integer>getShardingValue(shardingValues, "order_id");

        boolean middleRouteFlag = false;
        boolean suffixRouteFlag = false;

        //只采用userId路由
        if (orderIdValueSet.isEmpty()) {
            middleRouteFlag = true;
        }
        //只采用oderId路由
        if (tcdValueSet.isEmpty()) {
            suffixRouteFlag = true;
        }

        List<String> result = new ArrayList<>();
        Set<List<String>> valueResult = null;

        if (!middleRouteFlag && !suffixRouteFlag) {
            valueResult = Sets.cartesianProduct(tcdValueSet, orderIdValueSet);
        } else if (middleRouteFlag) {
            valueResult = Sets.cartesianProduct(tcdValueSet);
        } else {
            valueResult = Sets.cartesianProduct(orderIdValueSet);
        }

        for (List<String> value : valueResult) {
            String middle = null;
            String suffix = null;
            String allKeysSuffix = null;

            //中间占位符
            if (middleRouteFlag) {
                middle = "_" + Integer.parseInt(value.get(0)) % 2 + "_";
            }

            //后缀占位符
            if (suffixRouteFlag) {
                suffix = value.get(0);
            }

            //全部占位符拼接
            if (!middleRouteFlag && !suffixRouteFlag) {
                allKeysSuffix = Joiner.on("_").join(Integer.parseInt(value.get(0)) % 2, Integer.parseInt(value.get(1)) % 2);
            }

            for (String tableName : availableTargetNames) {
                //只采用主键id路由
                if (middleRouteFlag && tableName.contains(middle)) {
                    result.add(tableName);
                }
                //只采用create_time转化后的季度值路由
                if (suffixRouteFlag && tableName.endsWith(suffix)) {
                    result.add(tableName);
                }
                //默认采用采用主键id+create_time转化后的季度值路由
                if (null != allKeysSuffix && tableName.endsWith(allKeysSuffix)) {
                    result.add(tableName);
                }
            }

        }
        return result;
    }

    @SuppressWarnings("rawtypes")
    private <T> Set<String> getShardingValue(final Collection<ShardingValue<?>> shardingValues, final String shardingKey) {
        Set<String> resultSet = new HashSet<String>();
        Set<T> valueSet = new HashSet<T>();
        ShardingValue shardingValue = null;
        for (ShardingValue<?> each : shardingValues) {
            if (each.getColumnName().equals(shardingKey)) {
                shardingValue = (ShardingValue) each;
                break;
            }
        }
        if (null == shardingValue) {
            return resultSet;
        }
        switch (shardingValue.getType()) {
            case SINGLE:
                valueSet.add((T) shardingValue.getValue());
                break;
            case LIST:
                valueSet.addAll(shardingValue.getValues());
                break;
            case RANGE:
                T temp = (T) shardingValue.getValueRange().lowerEndpoint();
                if (temp instanceof Integer) {
                    valueSet.add((T) shardingValue.getValueRange().lowerEndpoint());
                    valueSet.add((T) shardingValue.getValueRange().upperEndpoint());
                }
                if (temp instanceof Date) {
                    valueSet.add((T) shardingValue.getValueRange().lowerEndpoint());
                    valueSet.add((T) shardingValue.getValueRange().upperEndpoint());
                }
                break;
            default:
                throw new UnsupportedOperationException();
        }

        for (T value : valueSet) {
            if (value instanceof Integer) {
                resultSet.add(value.toString());
            } else {
                resultSet.add(value.toString());
            }
        }
        return resultSet;
    }

}
