package com.dsl.simple.generic.core;

import java.util.List;

public class ObjectHolder<T> implements GenericObject<T>
{
    private T object;
    private List<CustomObject> customObjects;

    void setObject(T object)
    {
        this.object = object;
    }

    void setCustomObjects(List<CustomObject> customObjects)
    {
        this.customObjects = customObjects;
    }

    @Override
    public T getObject()
    {
        return object;
    }

    @Override
    public List<CustomObject> getCustomObjects()
    {
        return customObjects;
    }
}
