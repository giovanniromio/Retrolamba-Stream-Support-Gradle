package factoryPattern;

public class Uomo implements Persona {

	public int age;

	public Uomo(int age) {
		this.age = age;
	}

	public void increaseAge() {
		Personas.increaseAge(this.age);
	}

}
