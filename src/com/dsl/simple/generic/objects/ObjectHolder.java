package com.dsl.simple.generic.objects;

import java.util.List;

public class ObjectHolder<T> implements GenericObject<T>
{
    private T object;
    private List<CustomObject> customObjects;

    public void setObject(T object)
    {
        this.object = object;
    }

    public void setCustomObjects(List<CustomObject> customObjects)
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
