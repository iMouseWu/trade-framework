package com.netease.workflow.component;

import com.netease.workflow.TradeContext;
import com.netease.workflow.chain.TradeChain;
import com.netease.workflow.core.Component;

/**
 * @author wuhao
 */
public class ActivityCalculateComponent implements Component {

    @Override
    public void doNext(TradeChain tradeChain, TradeContext tradeContext) {
        //TODO 活动计算
        tradeChain.chain(tradeContext);
    }
}
