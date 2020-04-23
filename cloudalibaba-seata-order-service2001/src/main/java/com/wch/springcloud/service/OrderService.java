package com.wch.springcloud.service;

import com.wch.springcloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
