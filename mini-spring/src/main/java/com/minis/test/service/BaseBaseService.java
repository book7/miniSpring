package com.minis.test.service;

/**
 * @author tjy
 * @date 2023/03/17
 **/
public class BaseBaseService {

    private AServiceImpl as;

    public BaseBaseService(){

    }

    public AServiceImpl getAs() {
        return as;
    }

    public void setAs(AServiceImpl as) {
        this.as = as;
    }

    public void sayHello() {
        System.out.println("Base Base Service says hello");
    }
}
