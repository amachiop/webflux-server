package com.nttdata.bootcamp.webfluxdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {
	
	@GetMapping("/person-list1")
	public Flux<Person> personList1(){
		Flux<Person> flujoPersona = Flux.just(new Person("Pepito", "Perez", 23));
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return flujoPersona;
	}
	
	@GetMapping("/person-list2")
	public Flux<Person> personList2(){
		Flux<Person> flujoPersona = Flux.just(new Person("Manolo", "Sanchez", 21));
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return flujoPersona;
	}
	
	@GetMapping("/person-list3")
	public Flux<Person> personList3(){
		Flux<Person> flujoPersona = Flux.just(new Person("Rodrigo", "Rodriguez", 47));
		try{
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return flujoPersona;
	}
	
	@GetMapping("/person-list4")
	public Flux<Person> personList4(){
		Flux<Person> flujoPersona = Flux.just(new Person("Marcos", "Puerta", 7));
		try{
			Thread.sleep(4000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return flujoPersona;
	}

}
