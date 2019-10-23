package com.dsl.simple.generic.core;

import java.util.Collections;

public final class ObjectFactory
{
    private ObjectFactory() {}

    public static ObjectHolder createObject(String type)
    {
        switch (type)
        {
            case "foo":
                return createFoo();
            case "bar":
                return createBar();
            default:
                return null;
        }
    }

    private static ObjectHolder<Foo> createFoo()
    {
        ObjectHolder<Foo> fooHolder = new ObjectHolder<>();
        fooHolder.setObject(new Foo());
        fooHolder.setCustomObjects(Collections.singletonList(new CustomObject()));
        return fooHolder;
    }

    private static ObjectHolder<Bar> createBar()
    {
        ObjectHolder<Bar> barHolder = new ObjectHolder<>();
        barHolder.setObject(new Bar());
        barHolder.setCustomObjects(Collections.singletonList(new CustomObject()));
        return barHolder;
    }
}
