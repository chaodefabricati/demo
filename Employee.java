public class Employee extends Person {

	// put the implementation here
	
	private String socialNumber;
	private String pisNumber;

	public Employee(int cod, String name, String cpf, Character gender, String address, City city, String socialNumber, String pisNumber) {
		super(cod, name, cpf, gender, address, city);
		this.socialNumber = socialNumber;
		this.pisNumber = pisNumber;
	}

	public String getSocialNumber() {
		return this.socialNumber;
	}

	public String getPisNumber() {
		return this.pisNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public void setPisNumber(String pisNumber) {
		this.pisNumber = pisNumber;
	}
}
