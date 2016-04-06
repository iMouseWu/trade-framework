package com.netease.workflow.bo;

import java.util.List;

/**
 * @author wuhao
 */
public class OrderBO {

    private List<OrderItemBO> orderItemBOs;

    public List<OrderItemBO> getOrderItemBOs() {
        return orderItemBOs;
    }

    public void setOrderItemBOs(List<OrderItemBO> orderItemBOs) {
        this.orderItemBOs = orderItemBOs;
    }
}
