package com.dsl.simple.generic.core;

import java.util.List;

public interface GenericObject<T>
{
    T getObject();

    List<CustomObject> getCustomObjects();
}
