package com.danielnunesro.quempegou.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielnunesro.quempegou.entity.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
	
	Optional<List<Registro>> findByItem(String item);
	
	Optional<List<Registro>> findByName(String name);
	
	Optional<List<Registro>> findByDate(LocalDate date);
}
