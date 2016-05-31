package com.company.luis;

/**
 * Created by Luis Ginanjar on 07/02/2016.
 */
public class Employee extends People {
    public String nik;

    public Employee() {
        super();
        this.nik = "1111";
    }

    @Override
    public String toString() {
        return "Employee{nik='"+ nik +"'} " + super.toString();
    }
}
