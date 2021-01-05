package productCat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROD_SUB_CATEGORY")
public class SubCategory {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SUB_CAT_CODE")
	private Integer subCatCode;
	 @Column(name="DESCRIPTION")
	 private String description;
	 @Column(name="CAT_CODE")
	 private Integer catCode;
	public Integer getSubCatCode() {
		return subCatCode;
	}
	public void setSubCatCode(Integer subCatCode) {
		this.subCatCode = subCatCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCatCode() {
		return catCode;
	}
	public void setCatCode(Integer catCode) {
		this.catCode = catCode;
	}
	 

}
