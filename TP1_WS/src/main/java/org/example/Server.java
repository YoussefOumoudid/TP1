package org.example;

import org.example.ws.CalculService;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {

        String url = "http://0.0.0.0:8088/";
        Endpoint.publish(url, new CalculService());
    }
}