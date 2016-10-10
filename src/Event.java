import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Event {
	//(String miasto, String adres, ArrayList<java.util.Date> dniWystepowania)
	public static final class EventDesc{
		private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
		private final String name;
		private final String address;
		private final List<Date> datesOfEvents;
		private final Date mutableField;
		
		public EventDesc(String name, String address, List<Date> datesOfEvents) {
			super();
			this.name = name;
			this.address = address;
			this.mutableField = new Date();
			this.datesOfEvents = new ArrayList<>(datesOfEvents); 
		}
		
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public ArrayList<Date> getDaysOfEvents() {
			return new ArrayList<>(datesOfEvents);
		}
		
		public EventDesc setName(String name){
			return new EventDesc(name, address,datesOfEvents);
		}
		
		public EventDesc setAddress(String address){
			return new EventDesc(name, address,datesOfEvents);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((datesOfEvents == null) ? 0 : datesOfEvents.hashCode());
			result = prime * result + ((mutableField == null) ? 0 : mutableField.hashCode());
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
			if (mutableField == null) {
				if (other.mutableField != null)
					return false;
			} else if (!mutableField.equals(other.mutableField))
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
			return "EventDesc [name=" + name + ", address=" + address + ", datesOfEvents=" + datesOfEvents
			+ ", mutableField=" + mutableField + "]";
		}
		
	}
}
	
