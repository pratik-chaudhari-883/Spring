package com.login.Exceptions;

import java.io.IOException;

public class ExceptionPayloadResponse extends IOException{
	
	public String devIMEI;

	public ExceptionPayloadResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionPayloadResponse(String devIMEI) {
		super("Device IMEI Number is not Register ---> "+devIMEI);
		
	}

}
