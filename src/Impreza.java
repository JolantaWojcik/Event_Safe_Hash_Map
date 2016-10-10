import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Impreza {
	private final String nazwa;
	private final List<String> uczestnicy;

	public Impreza(String nazwa, List<String> uczestnicy) {
		this.nazwa = nazwa;
		this.uczestnicy = new ArrayList<>(uczestnicy);
	}

	public String getNazwa() {
		return nazwa;
	}

	public List<String> getUczestnicy() {
		return new ArrayList<>(uczestnicy);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uczestnicy == null) ? 0 : uczestnicy.hashCode());
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Impreza other = (Impreza) obj;
		if (uczestnicy == null) {
			if (other.uczestnicy != null)
				return false;
		} else if (!uczestnicy.equals(other.uczestnicy))
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Impreza [nazwa=" + nazwa + ", uczestnicy=" + uczestnicy + "]";
	}

	public static void main(String[] args) {
		List<String> uczestnicy = new ArrayList<>(Arrays.asList("Jan","Asia","Kasia"));
		
		Impreza i1 = new Impreza("Urodziny", uczestnicy);
		Impreza i2 = new Impreza("Imieniny", uczestnicy);
		
		System.out.println(i1);
		System.out.println(i2);
		
		uczestnicy.add("Nowy");
		
		changeFieldValue(i1, "nazwa", "ZMIENIONA");
		
		System.out.println(i1);
		System.out.println(i2);
		
		String immutableRly = "AAA";
		
		changeFieldValue(immutableRly, "value", new char[]{'B','B','B'});
		
		System.out.println(immutableRly);
		
	}

	//poczytaj o refleksji java.lang.reflect
	private static void changeFieldValue(Object target, String fieldName, Object value) {
		try {
			Field field = target.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(target, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
