package inheritance2;

public class LogManager {
	//spagetti kod -birbirinin alternatifi olan durumlar i�in if kullanm�yoruz.
	//if logic de kullan�r�z
 public void log(int logType) {
	 if (logType==1) {
		 System.out.println("Veri tab�na logland�");
	 }else if(logType==2) {
		 System.out.println("Dosyaya tab�na logland�");
	 }else {
		 System.out.println("E-Mail g�nderildi");
	 }
 }
}

//1-Database
//2-File
//3-EMail