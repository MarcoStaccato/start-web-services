package com.staccato;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)


//Service Endpoint Interface SEI
public interface TimeServer{
    @WebMethod String getTimeAsString();
    @WebMethod long getTimeAsElapsed();
}