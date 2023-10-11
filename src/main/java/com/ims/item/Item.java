package com.ims.item;

import java.math.BigDecimal;
import java.sql.Date;

public class Item {

	private long id;
	private String name;
	private String unitCode;
	private BigDecimal sellingPrice;
	private BigDecimal purchasePrice;
	private Date openingBalanceDate;
	private BigDecimal openingBalanceQty;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Date getOpeningBalanceDate() {
		return openingBalanceDate;
	}
	public void setOpeningBalanceDate(Date openingBalanceDate) {
		this.openingBalanceDate = openingBalanceDate;
	}
	public BigDecimal getOpeningBalanceQty() {
		return openingBalanceQty;
	}
	public void setOpeningBalanceQty(BigDecimal openingBalanceQty) {
		this.openingBalanceQty = openingBalanceQty;
	}
}
