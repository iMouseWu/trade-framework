package com.netease.workflow;

import com.netease.workflow.bo.GorderBO;
import com.netease.workflow.dto.OrderFormDTO;

import java.util.List;

/**
 * @author wuhao
 */
public class TradeContext {

    private List<OrderFormDTO> orderFormDTOs;

    private GorderBO gorderBO;

    public List<OrderFormDTO> getOrderFormDTOs() {
        return orderFormDTOs;
    }

    public void setOrderFormDTOs(List<OrderFormDTO> orderFormDTOs) {
        this.orderFormDTOs = orderFormDTOs;
    }

    public GorderBO getGorderBO() {
        return gorderBO;
    }

    public void setGorderBO(GorderBO gorderBO) {
        this.gorderBO = gorderBO;
    }
}
