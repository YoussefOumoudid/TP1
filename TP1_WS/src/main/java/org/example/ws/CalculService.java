package org.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculService {
    @WebMethod
    public int somme(@WebParam int a, @WebParam int b){
        return a+b;
    }
    @WebMethod
    public int soustraction(@WebParam int a , @WebParam int b){
        return a-b;
    }
    @WebMethod
    public long multiplication(@WebParam long a, @WebParam long b){
        return a*b;
    }
    @WebMethod
    public int inverser(@WebParam int a){
        return -a;
    }
}
