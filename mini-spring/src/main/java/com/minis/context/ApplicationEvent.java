package com.minis.context;

import java.io.Serializable;
import java.util.EventObject;

/**
 * @author tjy
 * @date 2023/03/15
 **/
public class ApplicationEvent extends EventObject implements Serializable {

    private static final long serialVersionUID = 8403742586879257373L;

    protected String msg;


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
        this.msg = source.toString();
    }
}
