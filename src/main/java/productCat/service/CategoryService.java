package productCat.service;

import java.util.List;
import java.util.Optional;

import productCat.entities.Category;
import productCat.entities.SubCategory;

public interface CategoryService {
	public boolean saveCategory(Category category);
	public List<Category> getAllCategories();
	public  Optional<Category>  getCategoriesById(Integer catId);
	public boolean saveSubCategory(SubCategory subCategory);
	public List<SubCategory> getAllSubCategories() ;
	public Optional<SubCategory> getSubCategoriesById(Integer subCatId);
	public List<SubCategory> getSubCategoriesByCatId(Integer catId);
}
