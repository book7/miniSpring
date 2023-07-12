package com.minis.jdbc.pool;

/**
 * @author tjy
 * @date 2023/04/27
 **/
public class PoolExhaustedException extends Exception {
    private static final long serialVersionUID = 3392904942041974759L;

    public PoolExhaustedException(String msg) {
        super(msg);
    }
}
