package kodlamaio.northwind.business.abstratcs;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	  
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	  
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
    DataResult<List<Product>> getByProductNameContains(String productName);
	  
    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
	
    DataResult<List<Product>> getAllSorted();
}