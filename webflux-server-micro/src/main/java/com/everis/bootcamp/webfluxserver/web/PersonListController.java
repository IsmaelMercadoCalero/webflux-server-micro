package com.everis.bootcamp.webfluxserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
    public Flux<Person> personList1() {
		return null; 
		// Implementar }
	}

	@GetMapping("/person-list-2")
    public Flux<Person> personList2() {
		return null; 
		// Implementar }
	}

	@GetMapping("/person-list-3")
    public Flux<Person> personList3() {
		return null; 
		// Implementar }
	}

	@GetMapping("/person-list-4")
    public Flux<Person> personList4() {
		return null; 
		// Implementar }
	}
}
