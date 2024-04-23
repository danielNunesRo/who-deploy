package com.danielnunesro.quempegou.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonPropertyOrder({"id", "name", "item", "date", "hour"})
public class Registro implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String item;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	
	@JsonFormat(pattern = "HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime hour;
	
	
	public Registro () {
		
	}


	public Registro(String name, String item) {
		this.name = name;
		this.item = item;
		this.date = date;
		this.hour = hour;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getHour() {
		return hour;
	}


	public void setHour(LocalTime hour) {
		this.hour = hour;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, hour, id, item, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return Objects.equals(date, other.date) && Objects.equals(hour, other.hour) && Objects.equals(id, other.id)
				&& Objects.equals(item, other.item) && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
}
