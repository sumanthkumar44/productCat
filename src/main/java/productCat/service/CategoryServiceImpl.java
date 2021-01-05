package productCat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productCat.dao.CategoryDao;
import productCat.entities.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao categoryDao;
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

}
