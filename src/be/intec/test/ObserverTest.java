package be.intec.test;
import be.intec.implementations.Aandeel;
import be.intec.implementations.Internet;
import be.intec.implementations.Newspaper;


public class ObserverTest {

	public static void main (String args[]) {
		
		Newspaper printMedia = new Newspaper("Financial Times");
		
		Internet onlineMeda = new Internet("www.economist.com");
		
		Aandeel aandeel = new Aandeel ("Common", 186f, "General Electric");
		
		aandeel.registerObserver(printMedia);
		
		aandeel.registerObserver(onlineMeda);
		
		aandeel.setIndex(87f);
		
	}
	
}
