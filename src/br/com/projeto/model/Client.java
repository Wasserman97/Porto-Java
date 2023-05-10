package br.com.projeto.model;

public class Client {
	private String name;
	private String  email;
	private String password;
	private String cpf;
	private Vehicle vehicles;
	
	//Construtor vazio
	public Client() {
		super();
	}

	//Construtor cheio
	public Client(String name, String email, String password, String cpf) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
	}

	
	//Getters&Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Vehicle getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
