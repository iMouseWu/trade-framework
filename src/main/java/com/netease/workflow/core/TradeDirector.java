package com.netease.workflow.core;

import com.netease.workflow.dto.OrderFormDTO;
import com.netease.workflow.parse.domain.ConfigInfo;
import com.netease.workflow.parse.read.ConfigLoad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuhao
 */
public class TradeDirector {

    private ConfigLoad configLoad;

    private final static Map<String, List<Component>> COMPONENTMAP = new HashMap<>();

    public Iterable<Component> director(List<OrderFormDTO> orderFormDTOs) {
        Iterable<Component> iterable = new ArrayList<>(COMPONENTMAP.get(""));
        return iterable;
    }

    private void init() {
        ConfigInfo configInfo = configLoad.load();
        Map<String, List<String>> configMap = configInfo.getMap();
        for (Map.Entry<String, List<String>> stringListEntry : configMap.entrySet()) {
            List<String> componentNames = stringListEntry.getValue();
            COMPONENTMAP.put(stringListEntry.getKey(), null);
        }

    }

}
