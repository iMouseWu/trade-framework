package com.netease.workflow.core;

import com.netease.workflow.TradeContext;
import com.netease.workflow.chain.TradeChain;

/**
 * @author wuhao
 */
public interface Component {

    void doNext(TradeChain tradeChain, TradeContext tradeContext);
}
