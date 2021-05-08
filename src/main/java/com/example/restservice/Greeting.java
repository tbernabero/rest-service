package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;

	private String saludo = "Hola";
	private String despedida = "Adios";
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = saludo + ", " + content + ". " + despedida;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}