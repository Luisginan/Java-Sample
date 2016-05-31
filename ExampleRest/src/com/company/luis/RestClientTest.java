package com.company.luis;

import org.junit.Test;

/**
 * Created by luis on 2/5/2016.
 * Purpose : Test Rest Client
 */
public class RestClientTest {

    RestClient restClient = new RestClient();

    @Test
    public void testGet() throws Exception {
        System.out.println("Example Get :");
        restClient.get("http://homecamportal.cloudapp.net/api/user/signin?email=luisginan@gmail.com&password=123456");
    }

    @Test
    public void testPost() throws Exception {
        System.out.println("Example Post :");
        String inputValue = "{\n" +
                "  \"TABLE_NAME\": \"DeviceID\",\n" +
                "  \"UID\": \""+ Math.random() + "\",\n" +
                "  \"created\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"updated\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"PartitionKey\": \"IPcam\",\n" +
                "  \"RowKey\": \"1234567890199\",\n" +
                "  \"Timestamp\": \"2016-02-04T08:19:36.4752104+00:00\",\n" +
                "  \"ETag\": \"sample string 7\"\n" +
                "}";
        System.out.println(inputValue);
        restClient.post("http://homecamportal.cloudapp.net/api/Camera/InsertDeviceID",inputValue);
    }
}