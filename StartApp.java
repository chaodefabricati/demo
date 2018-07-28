
public class StartApp {

	public static void main(String[] args) {

		// System.out.println("Hello World");
		
		Person p1 = new Person();
		p1.setName("Paulo Silvino");
		p1.setCpf("99001102010");
		p1.setGender(new Character('M'));

		System.out.println("*** START ***");
				
		System.out.println(p1.getName() + ", " + p1.getCpf() + ", " + p1.getGender());

		System.out.println("*** FINISH ***");
	}

}
