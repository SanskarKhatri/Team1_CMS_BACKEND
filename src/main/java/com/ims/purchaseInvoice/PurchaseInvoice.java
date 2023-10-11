package com.ims.purchaseInvoice;

import java.math.BigDecimal;
import java.util.List;

import com.ims.address.Address;
import com.ims.branchLocation.BranchLocation;

public class PurchaseInvoice {
	
	private long id;
	private BranchLocation branchLocation;
	private String vendorName;
	private Address billingAddress;
	private BigDecimal totalGst;
	private BigDecimal BillAmount;
	private List<PurchaseInvoiceItem> orderItems;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BranchLocation getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(BranchLocation branchLocation) {
		this.branchLocation = branchLocation;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public BigDecimal getTotalGst() {
		return totalGst;
	}
	public void setTotalGst(BigDecimal totalGst) {
		this.totalGst = totalGst;
	}
	public BigDecimal getBillAmount() {
		return BillAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		BillAmount = billAmount;
	}
	public List<PurchaseInvoiceItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<PurchaseInvoiceItem> orderItems) {
		this.orderItems = orderItems;
	}
}
