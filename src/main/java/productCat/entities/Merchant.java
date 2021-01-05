package productCat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="MERCHANT")
public class Merchant {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MERCHANT_CODE")
	 private Integer merchantCode;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MOBILE")
	private Long mobile;
	@Column(name="ADDRESS")
	private String address;
	public Integer getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(Integer merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobile() {
		return mobile;
	}    
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
