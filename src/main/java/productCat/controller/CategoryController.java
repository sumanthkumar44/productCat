package productCat.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import productCat.entities.Category;
import productCat.entities.SubCategory;
import productCat.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@GetMapping(path="/")
	public String hello()
	{
		return "Hello";
	}
	@PostMapping(path = "/createCat", consumes = {"application/json","application/xml"} )
	public ResponseEntity<String> addCategory(@RequestBody Category category)
	{
		boolean result =categoryService.saveCategory(category);
		return (result? new ResponseEntity<>("Record created",HttpStatus.ACCEPTED): new ResponseEntity<>("Record already exist or Error while saving record",HttpStatus.OK));
	}
	@GetMapping(path="/getCat", produces= {"application/json"})
	public List<Category> getAllCategories()
	{
		return categoryService.getAllCategories();
	}
	@GetMapping(path="/getCat/{catId}", produces= {"application/json"})
	public  Optional<Category>  getCategoryByID(@PathVariable("catId") Integer catId)
	{
		return categoryService.getCategoriesById(catId);
	}
	
	@PostMapping(path = "/createSubCat", consumes = {"application/json","application/xml"} )
	public ResponseEntity<String> addSubCategory(@RequestBody SubCategory subCategory)
	{
		boolean result =categoryService.saveSubCategory(subCategory);
		return (result? new ResponseEntity<>("Record created",HttpStatus.ACCEPTED): new ResponseEntity<>("Record already exist or Error while saving record",HttpStatus.OK));
	}
	@GetMapping(path="/getSubCat", produces= {"application/json"})
	public List<SubCategory> getAllSubCategories()
	{
		return categoryService.getAllSubCategories();
	}
	@GetMapping(path="/getSubCat/{subCatId}", produces= {"application/json"})
	public  Optional<SubCategory>  getSubCategoryByID(@PathVariable("subCatId") Integer subcatId)
	{
		return categoryService.getSubCategoriesById(subcatId);
	}
	@GetMapping(path="/getSubCatByCat/{catId}", produces= {"application/json"})
	public  List<SubCategory>  getSubCategoryByCatID(@PathVariable("catId") Integer catId)
	{
		return categoryService.getSubCategoriesByCatId(catId);
	}

}
