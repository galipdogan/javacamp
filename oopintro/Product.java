package oopintro;

public class Product {
	
	public Product()
	{
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice,String detail) {
		this(); //ben �al��t�m � burada da �al��t�r�r
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
