public class City {
	
	private int cod;
	private String name;
	private UF uf;

	public City(int cod, String name, UF uf) {
		this.cod = cod;
		this.name = name;
		this.uf = uf;
	}

	// Get methods

	public int getCod() {
		return this.cod;
	}

	public String getName() {
		return this.name;
	}

	public UF getUf() {
		return this.uf;
	}

	// Set methods

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	// Other methods

	public String toString() {
		return "NAME: " + this.name + " - " + this.uf.getName();
	}

}
