package com.minis.web.servlet;

import javax.swing.text.View;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tjy
 * @date 2023/04/06
 **/
public class ModelAndView {
    /**
     * 前端表示
     */
    private Object view;
    /**
     * 返回的数据
     */
    private Map<String, Object> model = new HashMap<>();

    public ModelAndView() {
    }

    public ModelAndView(String viewName) {
        this.view = viewName;
    }

    public ModelAndView(View view) {
        this.view = view;
    }

    public ModelAndView(String viewName, Map<String, ?> modelData) {
        this.view = viewName;
        if (modelData != null) {
            addAllAttributes(modelData);
        }
    }

    public ModelAndView(View view, Map<String, ?> model) {
        this.view = view;
        if (model != null) {
            addAllAttributes(model);
        }
    }

    public ModelAndView(String viewName, String modelName, Object modelObject) {
        this.view = viewName;
        addObject(modelName, modelObject);
    }

    public ModelAndView(View view, String modelName, Object modelObject) {
        this.view = view;
        addObject(modelName, modelObject);
    }


    public void setViewName(String viewName) {
        this.view = viewName;
    }


    public String getViewName() {
        return (this.view instanceof String ? (String) this.view : null);
    }


    public void setView(View view) {
        this.view = view;
    }

    public View getView() {
        return (this.view instanceof View ? (View) this.view : null);
    }

    public boolean hasView() {
        return (this.view != null);
    }

    public boolean isReference() {
        return (this.view instanceof String);
    }

    public Map<String, Object> getModel() {
        return this.model;
    }

    private void addAllAttributes(Map<String, ?> modelData) {
        if (modelData != null) {
            model.putAll(modelData);
        }
    }

    public void addAttribute(String attributeName, Object attributeValue) {
        model.put(attributeName, attributeValue);
    }

    public ModelAndView addObject(String attributeName, Object attributeValue) {
        addAttribute(attributeName, attributeValue);
        return this;
    }

}
