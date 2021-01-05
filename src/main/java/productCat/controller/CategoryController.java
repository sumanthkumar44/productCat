package productCat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import productCat.entities.Category;
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
	@PostMapping(path = "/create", consumes = {"application/json","application/xml"} )
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

}
