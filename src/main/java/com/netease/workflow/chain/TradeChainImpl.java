package com.netease.workflow.chain;

import com.netease.workflow.TradeContext;
import com.netease.workflow.core.Component;

import java.util.Iterator;

/**
 * @author wuhao
 */
public class TradeChainImpl implements TradeChain {

    private Iterable<Component> components;

    public TradeChainImpl(Iterable<Component> components) {
        this.components = components;
    }

    @Override
    public void chain(TradeContext tradeContext) {
        Iterator<Component> iterator = components.iterator();
        if (iterator.hasNext()) {
            Component component = iterator.next();
            component.doNext(this, tradeContext);
        }
    }
}
