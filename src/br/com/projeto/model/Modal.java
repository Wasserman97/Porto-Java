package br.com.projeto.model;

public class Modal {
	private String transitBoard;
	private ModalDriver modalDriver;
	private ModalCategory modalCategory;
	
	//Construtor vazio
	public Modal() {
		super();
	}
	
	//Construtor cheio
	public Modal(String transitBoard, ModalDriver modalDriver, ModalCategory modalCategoy) {
		this.transitBoard = transitBoard;
		this.modalDriver = modalDriver;
		this.modalCategory = modalCategory;	
	}
	
	//Getters & Setters

	public String getTransitBoard() {
		return transitBoard;
	}

	public void setTransitBoard(String transitBoard) {
		this.transitBoard = transitBoard;
	}

	public ModalDriver getModalDriver() {
		return modalDriver;
	}

	public void setModalDriver(ModalDriver modalDriver) {
		this.modalDriver = modalDriver;
	}

	public ModalCategory getModalCategory() {
		return modalCategory;
	}

	public void setModalCategory(ModalCategory modalCategory) {
		this.modalCategory = modalCategory;
	}
	
	
	


	

















}




