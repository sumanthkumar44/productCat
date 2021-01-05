package productCat.service;

import java.util.List;

import productCat.entities.Category;

public interface CategoryService {
	public boolean saveCategory(Category category);
	public List<Category> getAllCategories();
}
