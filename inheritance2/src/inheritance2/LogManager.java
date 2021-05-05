package inheritance2;

public class LogManager {
	//spagetti kod -birbirinin alternatifi olan durumlar için if kullanmýyoruz.
	//if logic de kullanýrýz
 public void log(int logType) {
	 if (logType==1) {
		 System.out.println("Veri tabýna loglandý");
	 }else if(logType==2) {
		 System.out.println("Dosyaya tabýna loglandý");
	 }else {
		 System.out.println("E-Mail gönderildi");
	 }
 }
}

//1-Database
//2-File
//3-EMail