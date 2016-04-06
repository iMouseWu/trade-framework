package com.netease.workflow.chain;

import com.netease.workflow.TradeContext;

/**
 * @author wuhao
 */
public interface TradeChain {

    void chain(TradeContext tradeContext);
}
