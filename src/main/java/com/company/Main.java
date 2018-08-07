package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    //psvm + Tab
    public static void main(String[] args) throws IOException {
//        System.out.printf("%s - %s", 1, "Java");

        //RestTemplate (auto): JSON -> object, object -> JSON


        RestTemplate restTemplateWithString = new RestTemplate();
        String json = restTemplateWithString.getForObject(
                "https://itunes.apple.com/search?term=jack+johnson",
                String.class
        );

        ObjectMapper objectMapper = new ObjectMapper();
        ItunesResponse itunesResponse = objectMapper.readValue(json, ItunesResponse.class);
        System.out.println(itunesResponse);


        //HttpEntity - request
        //HttpEntity(headers)


        //Self construction -> exchange
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        RestTemplate restTemplateWithHeader = new RestTemplate();
        ResponseEntity<ItunesResponse> itunesResponseWithHeaders = restTemplateWithHeader.exchange(
                "https://itunes.apple.com/search?term=jack+johnson",
                HttpMethod.GET,
                new HttpEntity<Object>(headers),
                ItunesResponse.class
        );


        System.out.println("");
        System.out.println("");
        System.out.println("ItunesResponse with headers");
        //JsonObject или ResponseEntity
        ItunesResponse body = itunesResponseWithHeaders.getBody();
        System.out.println(body);


//        System.out.println(json);
//
//        String jsonString = new ObjectMapper()
//                .writerWithDefaultPrettyPrinter()
//                .writeValueAsString(json);
//
//        System.out.println(jsonString);



        //URL
        //http://site.com/users                      - GET
        //http://site.com/users?age=30&name=Evgeny   - GET
        //http://site.com/users                      - POST
        //http://site.com/users/1                    - PUT

        //http://site.com/users   - DELETE
        //http://site.com/users/1 - DELETE


        //METHOD
        //GET - достаем инфу с сервера - без тела запроса
        //POST - сохраняем (создаем)   - с телом
        //PUT - обновляем              - с телом
        //DELETE - удаляем             - с телом

        //OPTIONS
        //HEAD
        //PATCH

        //HEADERS
        //Content-Type - application/json
        //Content-Type - application/xml
        //Content-Type - text/html
        //Authorization
    }

    public List get() {
        return new ArrayList();
    }
    public void post() {}
    public void put() {}
    public void delete() {}
}
