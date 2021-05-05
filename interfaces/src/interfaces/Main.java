package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);//buraya istediðimiz loglarý new leyip getirdik
		
		Customer engin=new Customer(1,"Engin","Demiroð");
		
		customerManager.add(engin);

	}

}
