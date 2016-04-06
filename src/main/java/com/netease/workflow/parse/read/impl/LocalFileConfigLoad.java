package com.netease.workflow.parse.read.impl;

import com.alibaba.fastjson.JSON;
import com.netease.workflow.parse.domain.ConfigInfo;
import com.netease.workflow.parse.read.ConfigLoad;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author wuhao
 */
public class LocalFileConfigLoad implements ConfigLoad {

    @Override
    public ConfigInfo load() {
        File path = new File(this.getClass().getResource("/").getPath());
        File file = new File(path.getAbsolutePath() + "/config/config.json");
        String info = null;
        try {
            info = FileUtils.readFileToString(file);
        } catch (IOException e) {
            //TODO
        }
        return JSON.parseObject(info, ConfigInfo.class);
    }


}
