package com.netease.workflow;

import com.netease.workflow.dto.OrderFormDTO;

import java.util.List;

/**
 * @author wuhao
 */
public interface TradeHandle {

    void handle(List<OrderFormDTO> orderFormDTOs);
}
