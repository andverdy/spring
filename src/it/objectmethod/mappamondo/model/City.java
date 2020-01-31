package it.objectmethod.mappamondo.model;

public class City {

	private String name;
	private String countryCode;
	private long population;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append(this.getName() + "\n");
		sb.append(this.getCountryCode() + "\n");
		sb.append(this.getPopulation());

		return sb.toString();
	}

	@Override
	public boolean equals(Object arg0) {

		if (arg0 instanceof City)
			return true;
		City c = (City) arg0;
		if (this == c)
			return true;

		if (this.getName().equals(c.getName()) && this.getCountryCode().equals(c.getCountryCode())
				&& this.getPopulation() == (c.getPopulation()))
			;

		return false;
	}

}
