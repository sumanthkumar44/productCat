package productCat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import productCat.entities.SubCategory;

public interface SubCatDao extends JpaRepository<SubCategory,Integer>{

	public List<SubCategory> findAllSubCategoryByCatId(Integer catId);
}
