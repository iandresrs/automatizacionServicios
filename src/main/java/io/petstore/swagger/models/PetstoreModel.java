package io.petstore.swagger.models;

public class PetstoreModel {

    //Variables
    private String url;
    private String header;
    private String userBody;
    private String ordenBody;
    private final int RESPONSECODE;


    public PetstoreModel() {
        //Inicializacion de las variables
        this.url = "https://petstore.swagger.io/v2/user";
        this.header = "application/json";
        this.userBody = "{\n" +
                "  \"id\": 0,\n" +
                "  \"username\": \"string\",\n" +
                "  \"firstName\": \"string\",\n" +
                "  \"lastName\": \"string\",\n" +
                "  \"email\": \"string\",\n" +
                "  \"password\": \"string\",\n" +
                "  \"phone\": \"string\",\n" +
                "  \"userStatus\": 0\n" +
                "}";
        this.ordenBody = "{\n" +
                "  \"id\": 0,\n" +
                "  \"petId\": 0,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2021-11-16T19:30:01.318Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        this.RESPONSECODE = 200;
    }

    //Geters
    public String getUrl() {
        return url;
    }

    public String getHeader() {
        return header;
    }

    public String getUserBody() {
        return userBody;
    }

    public String getOrdenBody() {
        return ordenBody;
    }

    public int getRESPONSECODE() {
        return RESPONSECODE;
    }
}
