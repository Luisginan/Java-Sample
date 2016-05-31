package com.company.luis;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.parser.JSONParser;

/**
 * Created by luis on 2/5/2016.
 * Purpose : Practice Restful
 * Reference : http://www.tutorialspoint.com/json/json_java_example.htm
 */
public class JsonMapper {

    public String Encode(People people)
    {
        JSONObject obj = new JSONObject();

        obj.put("id",people.id);
        obj.put("name",people.name);
        obj.put("gender",people.gender);


        StringWriter out = new StringWriter();
        try {
            obj.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  obj.toJSONString();
    }

    public People Decode(String jsonString)
    {
        JSONParser parser = new JSONParser();
        try{
            JSONObject object = (JSONObject) parser.parse(jsonString);

            People people = new People();
            people.id = (String) object.get("id");
            people.name = (String) object.get("name");
            people.gender = (String) object.get("gender");

            return people;

        }catch(ParseException pe){

            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }

        return  null;
    }
}
