package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) { //static yaparak her seferinde new lemiyoruz uygulamay� durdurana kadar bellekte durur bu y�zdende belle�e esktra y�k y�kler
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
}
