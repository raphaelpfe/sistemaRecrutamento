package br.com.sistemaRecrutamento.model.person;

public class Address {
	private int id;
	private String cep;
	private String city;
	private String complement;
	private String district;
	private int number;
	private String states;
	private String street;
	
	public Address(int id, String cep, String city, String complement, String district,
			int number, String states, String street) {
		super();
		this.id = id;  
		this.cep = cep;
		this.city = city;
		this.complement = complement;
		this.district = district;
		this.number = number;
		this.states = states;
		this.street = street;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
