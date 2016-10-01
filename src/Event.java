import java.util.ArrayList;
import java.util.Date;

public class Event {
	//(String miasto, String adres, ArrayList<java.util.Date> dniWystepowania)
	public static final class EventDesc{
		private final String name;
		private final String address;
		private final ArrayList<Date> datesOfEvents;
		
		public EventDesc(String name, String address, ArrayList<Date> datesOfEvents) {
			super();
			this.name = name;
			this.address = address;
			this.datesOfEvents = new ArrayList<Date>(); //datesOfEvents;
		}
		
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public ArrayList<Date> getDaysOfEvents() {
			return datesOfEvents;
		}
		
		public EventDesc setName(String name){
			return new EventDesc(name, address,datesOfEvents);
		}
		
		public EventDesc setAddress(String address){
			return new EventDesc(name, address,datesOfEvents);
		}
		
		public EventDesc setDate(ArrayList<Date> datesOfEvents){
			return new EventDesc(name, address,datesOfEvents);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((datesOfEvents == null) ? 0 : datesOfEvents.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			EventDesc other = (EventDesc) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (datesOfEvents == null) {
				if (other.datesOfEvents != null)
					return false;
			} else if (!datesOfEvents.equals(other.datesOfEvents))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "EventDesc [name=" + name + ", address=" + address + ", datesOfEvents=" + datesOfEvents + "]";
		}
		
		
	}
}
	
