package com.minis.aop;

import java.lang.reflect.Method;

/**
 * @author tjy
 * @date 2023/05/06
 **/
public interface MethodBeforeAdvice extends BeforeAdvice{

    void before(Method method, Object[] args, Object target) throws Throwable;
}
