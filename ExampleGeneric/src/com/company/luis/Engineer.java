package com.company.luis;

/**
 * Created by Luis Ginanjar on 08/02/2016.
 * Purpose :
 */
public class Engineer extends People {
    public String skill;

    public Engineer() {
        this.skill = "Software Developer";
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "skill='" + skill + '\'' +
                "} " + super.toString();
    }
}
