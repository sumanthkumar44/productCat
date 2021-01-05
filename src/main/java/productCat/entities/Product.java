package productCat.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

public class Product {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="PROD_ID")
	private Integer prodId;
			@Column(name="PROD_NAME")
			private String prodName;
			@Column(name="CAT_CODE")
			private Integer catCode;
			@Column(name="SUB_CAT_CODE")
			private Integer subCatCode;
			@Column(name="PRICE")
			private BigDecimal price;
			@Column(name="DESCRIPTION")
			private String description;
			@Column(name="MERCHANT_CODE")
			private Integer merchantCode;
			@Column(name="QUANTITY")
			private Integer quantity;
			@Column(name="AVAILABLE")
			@Type(type =  "org.hibernate.type.NumericBooleanType")
			private Integer aivalable;
			public Integer getProdId() {
				return prodId;
			}
			public void setProdId(Integer prodId) {
				this.prodId = prodId;
			}
			public String getProdName() {
				return prodName;
			}
			public void setProdName(String prodName) {
				this.prodName = prodName;
			}
			public Integer getCatCode() {
				return catCode;
			}
			public void setCatCode(Integer catCode) {
				this.catCode = catCode;
			}
			public Integer getSubCatCode() {
				return subCatCode;
			}
			public void setSubCatCode(Integer subCatCode) {
				this.subCatCode = subCatCode;
			}
			public BigDecimal getPrice() {
				return price;
			}
			public void setPrice(BigDecimal price) {
				this.price = price;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public Integer getMerchantCode() {
				return merchantCode;
			}
			public void setMerchantCode(Integer merchantCode) {
				this.merchantCode = merchantCode;
			}
			public Integer getQuantity() {
				return quantity;
			}
			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}
			public Integer getAivalable() {
				return aivalable;
			}
			public void setAivalable(Integer aivalable) {
				this.aivalable = aivalable;
			}
			
}
