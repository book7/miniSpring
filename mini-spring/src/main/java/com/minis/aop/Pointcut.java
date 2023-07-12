package com.minis.aop;

/**
 * @author tjy
 * @date 2023/05/10
 * @Deprecated 定义切点
 **/
public interface Pointcut {

    /**
     * 返回一条匹配规则
     *
     * @return
     */
    MethodMatcher getMethodMatcher();
}
