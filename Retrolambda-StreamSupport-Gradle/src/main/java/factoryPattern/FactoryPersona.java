package factoryPattern;

public class FactoryPersona {
	public static Uomo createUomo(int age) {
		return new Uomo(age);
	}
}
