package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message);//buradaki super base sınıftakileri constructorlarını çalıştırmaya yarar.
		this.data=data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);//buradaki super base sınıftakileri constructorlarını çalıştırmaya yarar.
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
	
	
}
