
import java.util.List;
import java.util.ArrayList;

public class StartApp {

	private int idUF;
	private int idCity;
	private int idPerson;

	public static void main(String[] args) {

		StartApp app = new StartApp();

		List<UF> listaUFs = new ArrayList<UF>();
		List<City> listaCities = new ArrayList<City>();
		List<Person> listaPersons = new ArrayList<Person>();
		
		listaUFs.add(new UF("BA", "BAHIA"));
		listaUFs.add(new UF("PE", "PERNAMBUCO"));
		listaUFs.add(new UF("MG", "MINAS GERAIS"));
		listaUFs.add(new UF("RJ", "RIO DE JANEIRO"));

		listaCities.add(new City(app.nextIdCity(), "JUAZEIRO", app.findUF(listaUFs,"BA")));
		listaCities.add(new City(app.nextIdCity(), "SALVADOR", app.findUF(listaUFs,"BA")));
		listaCities.add(new City(app.nextIdCity(), "SEHOR DO BONFIM", app.findUF(listaUFs,"BA")));
		listaCities.add(new City(app.nextIdCity(), "FEIRA DE SANTANA", app.findUF(listaUFs,"BA")));

		listaCities.add(new City(app.nextIdCity(), "PETROLINA", app.findUF(listaUFs,"PE")));
		listaCities.add(new City(app.nextIdCity(), "RECIFE", app.findUF(listaUFs,"PE")));
		listaCities.add(new City(app.nextIdCity(), "SALGUEIRO", app.findUF(listaUFs,"PE")));
		listaCities.add(new City(app.nextIdCity(), "ARARIPINA", app.findUF(listaUFs,"PE")));

		listaCities.add(new City(app.nextIdCity(), "BELO HORIZONTE", app.findUF(listaUFs,"MG")));
		listaCities.add(new City(app.nextIdCity(), "CONTAGEM", app.findUF(listaUFs,"MG")));
		listaCities.add(new City(app.nextIdCity(), "BETIM", app.findUF(listaUFs,"MG")));
		listaCities.add(new City(app.nextIdCity(), "TIMOTEO", app.findUF(listaUFs,"MG")));
		listaCities.add(new City(app.nextIdCity(), "UBERLANDIA", app.findUF(listaUFs,"MG")));

		listaCities.add(new City(app.nextIdCity(), "RIO DE JANEIRO", app.findUF(listaUFs,"RJ")));

		listaPersons.add(
			new Person(app.nextIdPerson(),"Paulo Silvino","99001102010", new Character('M'), "AV CONTORNO, 1315", app.findCity(listaCities,"BELO HORIZONTE")));
		listaPersons.add(
			new Person(app.nextIdPerson(),"Laiane Pedra","99182291021", new Character('F'), "AV CONTORNO, 1315", app.findCity(listaCities,"BELO HORIZONTE")));
		listaPersons.add(
			new Person(app.nextIdPerson(),"Rodolfo Pereira","88192011920", new Character('M'), "RUA DAS ALGAROBAS", app.findCity(listaCities,"ARARIPINA")));
		listaPersons.add(
			new Person(app.nextIdPerson(),"Rosana Pereira","71882910110", new Character('F'), "RUA DAS ALGAROBAS", app.findCity(listaCities,"ARARIPINA")));
		listaPersons.add(
			new Person(app.nextIdPerson(),"Romero Brito","66192001920", new Character('M'), "AV CENTRAL", app.findCity(listaCities,"RIO DE JANEIRO")));

		System.out.println("*** START ***\n");
				
		for (Person p : listaPersons) {
			System.out.println(p.toString());
			System.out.println("*************");
		}
		
		System.out.println("*** FINISH ***\n");
	}

	private int nextIdCity() {
		return idCity++;
	}

	private int nextIdPerson() {
		return idPerson++;
	}

	private UF findUF(List<UF> lista, String cod) {
		for (UF uf : lista) {
			if (uf.getCod().equals(cod)) {
				return uf;
			}
		}
		return null;
	}

	private City findCity(List<City> lista, String name) {
		for (City city : lista) {
			if (city.getName().equals(name)) {
				return city;
			}
		}
		return null;
	}

}
