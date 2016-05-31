package com.company.luis;

/**
 * Created by Luis Ginanjar on 07/02/2016.
 */
public  class People {
    public String id;
    public String name;

    public People() {
        this.id = "0001";
        this.name = "Luis";
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
