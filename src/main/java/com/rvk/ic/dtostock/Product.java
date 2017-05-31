package com.rvk.ic.dtostock;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Product {
	private String productId; // exa: = audio99901, vodeo99901,Book99901,
	private int si_no;// 08755
	private String productName;
	private String ProductType;
	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "Issue Date")
	 */
	private Date issueAt;
	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "Entry_At")
	 */
	private Date entryAt;
	private int quantity;
	private int price;
	private int total;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getSi_no() {
		return si_no;
	}

	public void setSi_no(int si_no) {
		this.si_no = si_no;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public Date getIssueAt() {
		return issueAt;
	}

	public void setIssueAt(Date issueAt) {
		this.issueAt = issueAt;
	}

	public Date getEntryAt() {
		return entryAt;
	}

	public void setEntryAt(Date entryAt) {
		this.entryAt = entryAt;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
