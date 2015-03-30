package com.staccato;

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "com.staccato.TimeServer")

//Service Implementation Bean

public class TimeServerImpl implements TimeServer {

    public String getTimeAsString(){return new Date().toString();}

    public long getTimeAsElapsed(){return new Date().getTime();}
}
