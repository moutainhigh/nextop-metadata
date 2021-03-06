package com.nextop.metadata.service;

import com.nextop.metadata.entity.Order;

/**
 * Description:
 *
 * @author: eric.liang
 * @date: 5/29/20
 * @update:
 */
public interface OrderService {

    Order find(Long id);

    int save(Order order);
}
