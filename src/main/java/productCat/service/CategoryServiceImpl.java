package productCat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productCat.dao.CategoryDao;
import productCat.dao.SubCatDao;
import productCat.entities.Category;
import productCat.entities.SubCategory;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	SubCatDao subCatDao;
	public boolean saveCategory(Category category)
	{
		Category result= categoryDao.save(category);
		
		return (result!=null? true:false);
	}
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryDao.findAll();
	}
	@Override
	public Optional<Category> getCategoriesById(Integer catId) {
		// TODO Auto-generated method stub
		return  categoryDao.findById(catId);
	}
	@Override
	public boolean saveSubCategory(SubCategory subCategory) {
		SubCategory result= subCatDao.save(subCategory);
		
		return (result!=null? true:false);
	}
	@Override
	public List<SubCategory> getAllSubCategories() {
		// TODO Auto-generated method stub
		return (List<SubCategory>) subCatDao.findAll();
	}
	@Override
	public Optional<SubCategory> getSubCategoriesById(Integer subCatId) {
		// TODO Auto-generated method stub
		return  subCatDao.findById(subCatId);
	}
	@Override
	public List<SubCategory> getSubCategoriesByCatId(Integer catId) {
		// TODO Auto-generated method stub
		return subCatDao.findAllSubCategoryByCatId(catId);
	}

}
