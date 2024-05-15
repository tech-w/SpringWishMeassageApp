package com.sc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sc.config.config;
import com.sc.sbeans.WishMessageGenerator;
public class Client {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
		WishMessageGenerator obj=ctx.getBean("mess",WishMessageGenerator.class);
		String rs=obj.Display("Don");
		System.out.println(rs);
		ctx.close();
	}

}
