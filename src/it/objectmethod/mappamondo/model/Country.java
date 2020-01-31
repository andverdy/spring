package it.objectmethod.mappamondo.model;

public class Country {

	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append(this.getName() + "\n");
		sb.append(this.getCode());

		return sb.toString();
	}

	@Override
	public boolean equals(Object arg0) {

		if (arg0 instanceof Country)
			return true;
		Country c = (Country) arg0;
		if (this == c)
			return true;

		if (this.getName().equals(c.getName()) && this.getCode().equals(c.getCode()))
			return true;

		return false;
	}

}
