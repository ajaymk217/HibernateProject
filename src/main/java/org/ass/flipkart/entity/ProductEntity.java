package org.ass.flipkart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = " product_info")
public class ProductEntity implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "product_type")
	private String productType;
	
	@Column(name= "price")
	private long price;
	
	@Column(name= "manufacture_date")
	private Date manufactureDate;
	
	@Column(name= "quantity")
	private long quantity;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductEntity [altKey=" + altKey + ", name=" + name + ", productType=" + productType + ", price="
				+ price + ", manufactureDate=" + manufactureDate + ", quantity=" + quantity + "]";
	}

}
