package com.everis.bootcamp.webfluxserver.web;

public class Microservicio {
	public static void print(Person p) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Person 1: " + p.toString());
	}

}
