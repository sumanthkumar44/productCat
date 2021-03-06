package productCat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="PROD_CATEGORY")
public class Category {
	 @Id
	 @GenericGenerator(name="catGen" , strategy="increment")
	 @GeneratedValue(generator="catGen")
	 @Column(name ="CAT_CODE")
	private Integer catCode;
	 @Column(name ="DESCRIPTION") 
	private String description;
	 
	public Integer getCatCode() {
		return catCode;
	}
	public void setCatCode(Integer catCode) {
		this.catCode = catCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	 
}
