package defaultInterfaceMethod;

public interface Persona {

	public static Uomo createUomo(int age) {
		return new Uomo(age);
	}
}
