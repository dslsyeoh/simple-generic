package com.dsl.simple.generic.objects;

import java.util.List;

public interface GenericObject<T>
{
    T getObject();

    List<CustomObject> getCustomObjects();
}
