package com.company.luis;

public class Main {

    public static void main(String[] args) {

	 RestClient restClient = new RestClient();
        System.out.println("Example Get :");
        restClient.get("http://homecamportal.cloudapp.net/api/user/signin?email=luisginan@gmail.com&password=123456");

        System.out.println("Example Post :");
        String inputValue = "{\n" +
                "  \"TABLE_NAME\": \"DeviceID\",\n" +
                "  \"UID\": \"1234567890199\",\n" +
                "  \"created\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"updated\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"PartitionKey\": \"IPcam\",\n" +
                "  \"RowKey\": \"1234567890199\",\n" +
                "  \"Timestamp\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"ETag\": \"sample string 7\"\n" +
                "}";
        restClient.post("http://homecamportal.cloudapp.net/api/Camera/InsertDeviceID",inputValue);

        System.out.println("Encode Json :");
        People people = new People();
        people.id = "001";
        people.name = "Luis Ginanjar";
        people.gender = "male";

        JsonMapper jsonMapper = new JsonMapper();
        String jsonString = jsonMapper.Encode(people);
        System.out.println(jsonString);

        System.out.println("Decode Json :");
        people = jsonMapper.Decode(jsonString);
        System.out.println(people);

    }
}
