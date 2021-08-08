package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="ASalsas")
public class ASalsas implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_RS;
	private String sabor;
	private String tam;
	private int cantidad;
	private Date fechaR = new Date();
	private String fechaC;
	
	
	public ASalsas() {
		super();
	}


	public ASalsas(int id_RS, String sabor, String tam, int cantidad, Date fechaR, String fechaC) {
		super();
		this.id_RS = id_RS;
		this.sabor = sabor;
		this.tam = tam;
		this.cantidad = cantidad;
		this.fechaR = fechaR;
		this.fechaC = fechaC;
	}


	public int getId_RS() {
		return id_RS;
	}


	public void setId_RS(int id_RS) {
		this.id_RS = id_RS;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getTam() {
		return tam;
	}


	public void setTam(String tam) {
		this.tam = tam;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Date getFechaR() {
		return fechaR;
	}


	public void setFechaR(Date fechaR) {
		this.fechaR = fechaR;
	}


	public String getFechaC() {
		return fechaC;
	}


	public void setFechaC(String fechaC) {
		this.fechaC = fechaC;
	}


}