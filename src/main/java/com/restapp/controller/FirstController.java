package com.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.model.Person;

import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")
public class FirstController {
	@GetMapping("/request/{sno}/{name}/{city}")
	public Mono<String> getInfo(@PathVariable Integer sno,@PathVariable String name,@PathVariable String city){
		Person p=new Person(sno,name,city);
		return Mono.just("A New Request is made successfully by"+sno+ " "+name+" "+city);
	}
	
}
