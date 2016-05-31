package com.company.luis;

/**
 * Created by Luis Ginanjar on 08/02/2016.
 * Purpose :
 */
public class ClassGeneric <T extends People> {

    Class<T> t;
    public ClassGeneric(Class<T> tClass) throws IllegalAccessException {
        t = tClass;
    }

    public T GetInstance() throws IllegalAccessException, InstantiationException {
        return t.newInstance();
    }

    public void RunAction(T people)
    {
        System.out.println(people.toString());
    }
}
