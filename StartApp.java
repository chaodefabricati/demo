
public class StartApp {

	private int idUF;
	private int idCity;
	private int idPerson;

	public static void main(String[] args) {

		StartApp app = new StartApp();

		// System.out.println("Hello World");
		
		UF ufBA = new UF("BA", "BAHIA");
		UF ufPE = new UF("PE", "PERNAMBUCO");
		UF ufMG = new UF("MG", "MINAS GERAIS");

		City cityJuazeiro = new City(app.nextIdCity(), "JUAZEIRO", ufBA);
		City citySalvador = new City(app.nextIdCity(), "SALVADOR", ufBA);
		City cityBonfim = new City(app.nextIdCity(), "SEHOR DO BONFIM", ufBA);
		City cityFeira = new City(app.nextIdCity(), "FEIRA DE SANTANA", ufBA);

		City cityPetrolina = new City(app.nextIdCity(), "PETROLINA", ufPE);
		City cityRecife = new City(app.nextIdCity(), "RECIFE", ufPE);
		City citySalgueiro = new City(app.nextIdCity(), "SALGUEIRO", ufPE);
		City cityAraripina = new City(app.nextIdCity(), "ARARIPINA", ufPE);

		City cityBeloHorizonte = new City(app.nextIdCity(), "BELO HORIZONTE", ufMG);
		City cityContagem = new City(app.nextIdCity(), "CONTAGEM", ufMG);
		City cityBetim = new City(app.nextIdCity(), "BETIM", ufMG);
		City cityTimoteo = new City(app.nextIdCity(), "TIMOTEO", ufMG);
		City cityUberlandia = new City(app.nextIdCity(), "UBERLANDIA", ufMG);

		Person p1 = new Person();
		p1.setName("Paulo Silvino");
		p1.setCpf("99001102010");
		p1.setGender(new Character('M'));
		p1.setAddress("AV CONTORNO, 1315");
		p1.setCity(cityBeloHorizonte);

		System.out.println("*** START ***");
				
		System.out.println(p1.toString());

		System.out.println("*** FINISH ***");
	}

	private int nextIdCity() {
		return idCity++;
	}

	private int nextIdPerson() {
		return idPerson++;
	}

}
