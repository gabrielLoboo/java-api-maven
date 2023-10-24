package br.com.fiap.model;

public class StarWars {

	private String name;
	private String diameter;
	private String climate;

	public StarWars() {
		super();
	}

	public StarWars(String name, String diameter, String climate) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.climate = climate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	@Override
	public String toString() {
		return "StarWars [name=" + name + ", diameter=" + diameter + ", climate=" + climate + "]";
	}

}
