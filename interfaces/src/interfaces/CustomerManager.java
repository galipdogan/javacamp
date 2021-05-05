package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		// Loosely -tightly coupled/ gev�ek -kat� ba��ml�l�k buray� gev�ek ba��ml�l��a �evirece�iz.
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		Utils.runLoggers(loggers,customer.getFirstName() );
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers,customer.getFirstName() );
		
	}
}
