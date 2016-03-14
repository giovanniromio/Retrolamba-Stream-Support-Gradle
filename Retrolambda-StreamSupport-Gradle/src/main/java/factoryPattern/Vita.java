package factoryPattern;

public class Vita {

	public static void main(String[] args) {
		/*
		Uomo giovanni = Persona.createUomo(22);
		
		System.out.println("" + giovanni.age);
		*/
		Uomo giovanni = FactoryPersona.createUomo(22);
		Personas.increaseAge(giovanni.age);
		System.out.println("" + giovanni.age);
	}

}
