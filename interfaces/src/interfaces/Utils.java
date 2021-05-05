package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String message) { //static yaparak her seferinde new lemiyoruz uygulamayý durdurana kadar bellekte durur bu yüzdende belleðe esktra yük yükler
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
}
