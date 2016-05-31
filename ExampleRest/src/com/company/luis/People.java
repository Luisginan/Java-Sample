package com.company.luis;

/**
 * Created by luis on 2/5/2016.
 * Purpose :
 */
public class People {
    public String id;
    public String name;
    public String gender;

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
