package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void updete(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}
