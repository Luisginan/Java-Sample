package com.company.luis;

import java.io.Serializable;

/**
 * Created by luis on 2/5/2016.
 * Purpose :
 */
public class People implements Serializable {
    public String id;
    public String fullName;
    public String Gender;

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}

