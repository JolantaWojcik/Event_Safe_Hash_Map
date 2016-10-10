import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main{
	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
	/*
	 * Stworz klase Wydarzenie (String miasto, String adres, ArrayList<java.util.Date> dniWystepowania)
	 * - chcemy ¿eby ta klasa by³a ca³kowicie immutable
	 * je¿eli chcesz zrobiæ settery to powinny one zwracac now¹ instacjê Wydarzenia (zmienion¹)
	 */
	  public static void main(String[] args) {
		//to jest zle pewnie:
		//Event.EventDesc
		//jak poprawnie przeniesc final static do innej klasy?

		HashMap<Event.EventDesc, String> eventsMap = new HashMap<>();
		List<Date> datesOfEvent1 = null;
		List<Date> datesOfEvent2 = null;
		List<Date> datesOfEvent3 = null;
		
		try {
			datesOfEvent1 = new ArrayList<>(Arrays.asList(DATE_FORMATTER.parse("2016-12-31"), 
					DATE_FORMATTER.parse("2017-12-31")));
			datesOfEvent2 = new ArrayList<>(Arrays.asList(DATE_FORMATTER.parse("2015-12-24"), 
					DATE_FORMATTER.parse("2014-12-24"), DATE_FORMATTER.parse("2013-12-24")));
			datesOfEvent3 = new ArrayList<>(Arrays.asList(DATE_FORMATTER.parse("1996-12-01"), 
					DATE_FORMATTER.parse("1996-12-01")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test " + DATE_FORMATTER.format(datesOfEvent1.get(0)));
//		System.out.println(setFormatt(datesOfEvent1));
//		datesOfEvent1.forEach((p) -> System.out.format(DATE_FORMATTER.format(p)));
//		List<Date> formatted1= datesOfEvent1.stream().filter(Objects::nonNull)
//				.map(s->DATE_FORMATTER.format(s)).collect(Collectors.toList());
		//System.out.println("1### " + formatted1);
		 Event.EventDesc e1 = new Event.EventDesc("new year party", "krk", datesOfEvent1);
		 Event.EventDesc e2 = new Event.EventDesc("christmas party", "krk", datesOfEvent2);
		 Event.EventDesc e3 = new Event.EventDesc("birthday", "krk", datesOfEvent3);
		
		eventsMap.put(e1, "new year");
		eventsMap.put(e2, "christmas");
		eventsMap.put(e3, "birthday");

		e1.setName("birthday");

		System.out.println("###");
		System.out.println(eventsMap.keySet());
		System.out.println("New event one: " + e1);
		System.out.println("Dates issue: " + e1.getDaysOfEvents());
	}

//	  private static List<Date> setFormatt(List<Date> formatted){
//		  for(Date d : formatted){
//			  DATE_FORMATTER.format(d);
//			  formatted.add(d);
//		  }
//		return formatted;
//	  }
}
