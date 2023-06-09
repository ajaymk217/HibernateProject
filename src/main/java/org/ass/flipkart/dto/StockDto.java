package org.ass.flipkart.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class StockDto implements Serializable {
	
	private long productId;
	
	private long quantity;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
