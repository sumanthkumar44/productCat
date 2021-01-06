package productCat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import productCat.entities.Category;

@Repository
public interface CategoryDao  extends JpaRepository<Category, Integer>  {

}
