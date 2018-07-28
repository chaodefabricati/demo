public class Person {

	// put the implementation here
	
	private int cod;
	private String name;
	private String cpf;
	private Character gender;
	private String address;
	private City city;

	// Get methods
	
	public int getCod() {
		return this.cod;
	}

	public String getName() {
		return this.name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public Character getGender() {
		return this.gender;
	}

	public String getAddress() {
		return this.address;
	}

	public City getCity() {
		return this.city;
	}

	// Set methods
	
	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(City city) {
		this.city = city;
	}

	// Other methods

	public String toString() {
		return "NAME: " + this.name + "\n"
			+ "CPF: " + this.cpf + "\n"
			+ "GENDER: " + this.gender + "\n"
			+ "ADDRESS: " + this.address + "\n"
			+ "CITY: " + this.city.toString() + "\n";
	}
}
