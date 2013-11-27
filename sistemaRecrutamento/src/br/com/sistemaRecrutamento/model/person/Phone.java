package br.com.sistemaRecrutamento.model.person;

public class Phone {
	private int id;
	private String countryCode;
	private String cityCode;
	private int number;
	
	public Phone(int id, String countryCode, String cityCode, int number) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.cityCode = cityCode;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
