package com.staccato;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class TimeClient{

	public static void main(String args[]) throws Exception{

		// Obtains wsdl
		URL url = new URL("http://localhost:9876/ts?wsdl");

		// 1st arg targetNamespace
		// 2nd arg name
		// both declared on wsdl
		QName qname = new QName("http://staccato.com/", "TimeServerImplService");

		// creates factory for the service
		Service service = Service.create(url, qname);

		// Extract endpoint interface, the service port
		TimeServer eif = service.getPort(TimeServer.class);

		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}
}