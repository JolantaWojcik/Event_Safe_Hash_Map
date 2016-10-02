import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import java.util.ArrayList;
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
		ArrayList<Date> datesOfEvent1 = new ArrayList<Date>();
		datesOfEvent1.add(new Date());
		ArrayList<Date> datesOfEvent2 = new ArrayList<Date>();
		ArrayList<Date> datesOfEvent3 = new ArrayList<Date>();
		
		try {
			
			datesOfEvent1.add(DATE_FORMATTER.parse("2016-12-31"));
			datesOfEvent1.add(DATE_FORMATTER.parse("2017-12-31"));
			
			datesOfEvent2.add(DATE_FORMATTER.parse("2015-12-24"));
			datesOfEvent2.add(DATE_FORMATTER.parse("2014-12-24"));
			datesOfEvent2.add(DATE_FORMATTER.parse("2013-12-24"));
			
			datesOfEvent3.add(DATE_FORMATTER.parse("1996-12-01"));
			datesOfEvent3.add(DATE_FORMATTER.parse("1996-12-01"));
			

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Event.EventDesc e1 = new Event.EventDesc("new year party", "krk", datesOfEvent1);
		 Event.EventDesc e2 = new Event.EventDesc("christmas party", "krk", datesOfEvent2);
		 Event.EventDesc e3 = new Event.EventDesc("birthday", "krk", datesOfEvent3);
		
		eventsMap.put(e1, "new year");
		eventsMap.put(e2, "christmas");
		eventsMap.put(e3, "birthday");
		
		System.out.println("test1: " + eventsMap.get(e1)); 
		System.out.println("test2: " + eventsMap.get(e2));
		System.out.println("test2: " + eventsMap.get(e3));

		e1.setName("birthday");

		System.out.println("###");
		System.out.println(eventsMap.keySet());
		System.out.println("New event one: " + e1);
		System.out.println("Dates issue: " + e1.getDaysOfEvents());
	}

}
