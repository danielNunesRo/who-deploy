package com.danielnunesro.quempegou.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielnunesro.quempegou.entity.Registro;
import com.danielnunesro.quempegou.repository.RegistroRepository;

@Service
public class RegistroService {
	
	@Autowired
	private RegistroRepository repository;
	
	public Registro create(Registro registro) {
		registro.setDate(LocalDate.now());
		registro.setHour(LocalTime.now());
		repository.save(registro);
		return registro;
		
	}
	
	public List<Registro> findAll() {
		return repository.findAll();
	}
	
	public List<Registro> findByItem(String item) {
		return repository.findByItem(item).orElseThrow(() -> new RuntimeException("Nenhum item encontrado"));
	}
	
	public List<Registro> findByName(String name) {
		return repository.findByName(name).orElseThrow(() -> new RuntimeException());
	}
	
	public List<Registro> findByDate(LocalDate date) {
		return repository.findByDate(date).orElseThrow(() -> new RuntimeException());
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}
