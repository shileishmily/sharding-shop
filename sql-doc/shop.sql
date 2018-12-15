CREATE TABLE `order_0_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tcd` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'tcd码',
  `order_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '订单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `product_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
  `sys_id` int(11) DEFAULT NULL COMMENT '系统编号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `order_0_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tcd` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'tcd码',
  `order_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '订单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `product_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
  `sys_id` int(11) DEFAULT NULL COMMENT '系统编号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `order_1_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tcd` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'tcd码',
  `order_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '订单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `product_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
  `sys_id` int(11) DEFAULT NULL COMMENT '系统编号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `order_1_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tcd` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'tcd码',
  `order_id` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '订单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `product_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '商品名称',
  `sys_id` int(11) DEFAULT NULL COMMENT '系统编号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;