package com.ims.salesInvoice;

import java.math.BigDecimal;
import java.util.List;

import com.ims.address.Address;
import com.ims.branchLocation.BranchLocation;

public class SalesInvoice {
	
	private long id;
	private BranchLocation branchLocation;
	private String customerName;
	private Address shippingAddress;
	private Address billingAddress;
	private BigDecimal totalGst;
	private BigDecimal BillAmount;
	private List<SalesInvoiceItems> orderItems;
	
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
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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
	public List<SalesInvoiceItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<SalesInvoiceItems> orderItems) {
		this.orderItems = orderItems;
	}	
}
