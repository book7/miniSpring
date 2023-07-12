package com.minis.aop;

/**
 * @author tjy
 * @date 2023/05/05
 **/
public interface AopProxyFactory {

    AopProxy createAopProxy(Object target, PointcutAdvisor advisor);
}
