package com.company.luis;

/**
 * Created by Luis Ginanjar on 07/02/2016.
 * Purpose :
 */
public class MethodGeneric {

    public <T extends People> void runAction( T people )
    {
        System.out.println(people.toString());
    }

    public <T extends People> T GetInstance(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        return (T) tClass.newInstance();
    }
}

