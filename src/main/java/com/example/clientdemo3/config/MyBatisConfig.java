package com.example.clientdemo3.config;

import com.mdl.common.config.MdlMyBatisConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisConfig
 * @Package com.example.clientdemo3.config
 * @Description:
 * @Date 2018/6/4下午 2:05
 */
@Configuration
public class MyBatisConfig extends MdlMyBatisConfig{
    @Override
    protected String getTypeAliasesPackage() {
        return "com.example.clientdemo3.entity";
    }

    @Override
    protected String getMapperLocations() {
        return null;
    }

    @Override
    protected String getBasePackage() {
        return "com.example.clientdemo3.dao";
    }
}
