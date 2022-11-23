package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.test.property.GetTimestamp;

@RestController  
public class HelloWorldController   
{

	String greeting = System.getenv("GREETING");

	@RequestMapping("/getTimestamp")
	public String getTimestamp()
	{
		System.out.println(""); 
		GetTimestamp t= new GetTimestamp();	    	
		 String prev_timestamp = t.read();
		 System.out.println("Previous timestamp-----> "+prev_timestamp);

		 java.util.Date date=new java.util.Date();
		 String latest_timestamp = date.toString();
		 t.write(latest_timestamp);

		 String run_env;
		 run_env = System.getenv("RUN_ENV");

		 String output;
		 output = "<center><H1>Greeting of the day: " + greeting + "</H1>";
		 output = output + "<h2 style='color:green;'>version : 2.0</h2>";
		 output = output + "<h2 style='color:red;'> Previous Timestamp :"+prev_timestamp+"</h2>";
		 output = output + "<h2 style='color:blue;'> Latest Timestamp :"+latest_timestamp+"</h2>";
		 if(run_env != null)
		 	output = output + "<h2 style='color:#f90e4e;'> Run Env :"+run_env+"</h2>";
		 output = output + "";
		 output = output + "</center>";

		 return output;
	}  
}
