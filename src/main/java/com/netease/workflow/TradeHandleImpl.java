package com.netease.workflow;

import com.netease.workflow.chain.TradeChain;
import com.netease.workflow.chain.TradeChainImpl;
import com.netease.workflow.core.Component;
import com.netease.workflow.core.TradeDirector;
import com.netease.workflow.dto.OrderFormDTO;

import java.util.List;

/**
 * @author wuhao
 */
public class TradeHandleImpl implements TradeHandle {

    private TradeDirector tradeDirector;

    @Override
    public void handle(List<OrderFormDTO> orderFormDTOs) {

        TradeContext tradeContext = new TradeContext();
        tradeContext.setOrderFormDTOs(orderFormDTOs);


        Iterable<Component> components = tradeDirector.director(orderFormDTOs);

        TradeChain tradeChain = new TradeChainImpl(components);
        tradeChain.chain(tradeContext);
    }
}
