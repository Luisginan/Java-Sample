package com.company.luis;

public class Main {

    public static void main(String[] args) {

        Serializator serializator = new Serializator();
        People people = new People();
        people.id = "9049034034";
        people.fullName = "Luis Ginanjar";
        people.Gender = "Male";

        System.out.println("Serialize :");
        String pathFile = "C:\\Users\\luis\\Desktop\\people.txt";
        serializator.Serialize(people,pathFile);

        System.out.println("Deserialize :");
        people = serializator.Deserialize(pathFile);
        System.out.println(people.toString());

    }
}
