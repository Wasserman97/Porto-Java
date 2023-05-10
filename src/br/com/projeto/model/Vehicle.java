package br.com.projeto.model;

public class Vehicle {
	private String transitBoard;
	private float height;
	private float width;
	private float weight;
	private String isAxle;
	private String isCharge;
	
	//Construtor vazio
	public Vehicle() {
		super();
	}	
	//Construtor cheio

	public Vehicle(String transitBoard, float height, float width, float weight, String isAxle, String isCharge) {
		super();
		this.transitBoard = transitBoard;
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.isAxle = isAxle;
		this.isCharge = isCharge;
	}
	//Getters&Setters

	public String getTransitBoard() {
		return transitBoard;
	}

	public void setTransitBoard(String transitBoard) {
		this.transitBoard = transitBoard;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getIsAxle() {
		return isAxle;
	}

	public void setIsAxle(String isAxle) {
		this.isAxle = isAxle;
	}

	public String getIsCharge() {
		return isCharge;
	}

	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
