public class State {

	private int cod;
	private String name;
	private UF uf;

	public State(int cod, String name, UF uf) {
		this.cod = cod;
		this.name = name;
		this.uf = uf;
	}

	public int getCod() {
		return this.cod;
	}

	public String getName() {
		return this.name;
	}

	public UF getUf() {
		return this.uf;
	}
}
