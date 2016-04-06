package com.netease.workflow.parse.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wuhao
 */
public class ConfigInfo {

    private Map<String, List<String>> map = new HashMap<>();

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }
}
