/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved
 */

package com.dsl.simple.generic;

import com.dsl.simple.generic.objects.Bar;
import com.dsl.simple.generic.objects.Foo;
import com.dsl.simple.generic.objects.ObjectHolder;

import java.util.Objects;

import static com.dsl.simple.generic.core.ObjectFactory.*;

public class Main
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ObjectHolder<Foo> fooObjectHolder = createObject("foo");
        if(Objects.nonNull(fooObjectHolder))
        {
            System.out.println(fooObjectHolder.getClass());
            System.out.println(fooObjectHolder.getObject());
            System.out.println(fooObjectHolder.getCustomObjects());
            fooObjectHolder.getObject().print();
        }
        System.out.println("\n=========================================\n");
        ObjectHolder<Bar> barObjectHolder = createObject("bar");
        if(Objects.nonNull(barObjectHolder))
        {
            System.out.println(barObjectHolder.getClass());
            System.out.println(barObjectHolder.getObject());
            System.out.println(barObjectHolder.getCustomObjects());
            barObjectHolder.getObject().print();
        }
    }

}
