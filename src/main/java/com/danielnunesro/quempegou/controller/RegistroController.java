package com.danielnunesro.quempegou.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielnunesro.quempegou.entity.Registro;
import com.danielnunesro.quempegou.service.RegistroService;

@RestController
@RequestMapping("/quempegou")
public class RegistroController {
	
	@Autowired
	private RegistroService service;
	
	@PostMapping
	public ResponseEntity<Registro> create(@RequestBody Registro registro) {
		var newRegistro = service.create(registro);
		return ResponseEntity.status(HttpStatus.CREATED).body(newRegistro);
	}
	
	@GetMapping
	public ResponseEntity<List<Registro>> findAll() {
		List<Registro> newList = service.findAll();
		return ResponseEntity.ok().body(newList);
	}
	
	@GetMapping("/item/{item}")
	public ResponseEntity<List<Registro>> findByItem(@PathVariable String item) {
		List<Registro> newList = service.findByItem(item);
		return ResponseEntity.ok().body(newList);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Registro>> findByName(@PathVariable String name) {
		List<Registro> newList = service.findByName(name);
		return ResponseEntity.ok().body(newList);
	}
	
	@GetMapping("/date/{date}")
	public ResponseEntity<List<Registro>> findByDate(@PathVariable LocalDate date) {
		List<Registro> newList = service.findByDate(date);
		return ResponseEntity.ok().body(newList);
	}
	
	@DeleteMapping
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}
	
	
}
