package com.sc.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("mess")
public class WishMessageGenerator 
{
	@Autowired
	private LocalDateTime datetime;
	
	public String Display(String user)
	{
		int hours=datetime.getHour();
		if(hours<=12)
		{
			return "Good morning "+user;
		}
		else if(hours <= 15)
		{
			return "Good Agternun "+user;
		}
		else if(hours <= 20)
		{
			return "Good evening  "+user;
		}
		else
		{
			return "Good night"+user;
		}
	}

}
