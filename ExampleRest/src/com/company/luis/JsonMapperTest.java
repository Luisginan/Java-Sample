package com.company.luis;

import static org.junit.Assert.*;

/**
 * Created by luis on 2/5/2016.
 * Purpose :
 */
public class JsonMapperTest {

    JsonMapper jsonMapper = new JsonMapper();
    People people = new People();
    private String jsonPeople = "{\"id\":\"001\",\"name\":\"Luis Ginanjar\",\"gender\":\"male\"}";

    public JsonMapperTest() {
        people.id = "001";
        people.name = "Luis Ginanjar";
        people.gender = "male";
    }

    @org.junit.Test
    public void testEncode() throws Exception {
        String jsonString = jsonMapper.Encode(people);
        System.out.println(jsonString);
        assertEquals(jsonString, jsonPeople);
    }

    @org.junit.Test
    public void testDecode() throws Exception {
        People man = jsonMapper.Decode(jsonPeople);
        System.out.println(man);
        assertEquals(people.toString(), man.toString());
    }
}