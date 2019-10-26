/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved
 */

package com.dsl.simple.generic.objects;

import java.util.List;

public interface GenericObject<T>
{
    T getObject();

    List<CustomObject> getCustomObjects();
}
