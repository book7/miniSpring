package com.minis.core.env;

/**
 * @author tjy
 * @date 2023/03/22
 * @Deprecated 主要用于获取 Environment 实例
 **/
public interface EnvironmentCapable {

    /**
     * 获取环境实例
     *
     * @return
     */
    Environment getEnvironment();
}
