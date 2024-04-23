package com.danielnunesro.quempegou.unittest.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.danielnunesro.quempegou.entity.Registro;

public class RegistroTest {

	private Registro registro;

	@BeforeEach
	public void setUp() {
		registro = new Registro("Nome", "Item");
	}

	@Test
	public void testConstructor() {
		assertNotNull(registro);
		assertNotNull(registro.getDate());
		assertNotNull(registro.getHour());
	}
	
	@Test
    public void testGettersAndSetters() {
        registro.setId(1L);
        assertEquals(1L, registro.getId());
        
        registro.setName("NovoNome");
        assertEquals("NovoNome", registro.getName());
        
        registro.setItem("NovoItem");
        assertEquals("NovoItem", registro.getItem());
        
        registro.setDate(java.time.LocalDate.of(2022, 4, 24));
        assertEquals(LocalDate.of(2022, 4, 24), registro.getDate());
        
        registro.setHour(java.time.LocalTime.of(15, 30));
        assertEquals(LocalTime.of(15, 30), registro.getHour());
    }

}
