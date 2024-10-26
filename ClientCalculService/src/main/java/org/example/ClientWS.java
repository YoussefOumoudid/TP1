package org.example;

import proxy.CalculService;
import proxy.CalculServiceService;

public class ClientWS {
    public static void main(String[] args){
        CalculService stub = new CalculServiceService().getCalculServicePort();
        System.out.println(stub.somme(2,3));
        System.out.println(stub.multiplication(5,3));
        System.out.println(stub.inverser(2022));
    }
}
