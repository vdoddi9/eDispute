package com.att.edispute.rules;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class AccountInfo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ACCOUNTINFO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ACCOUNTINFO_ID_GENERATOR", sequenceName = "ACCOUNTINFO_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("BAN")
	private java.lang.String billingAccount;

	@org.kie.api.definition.type.Label("adjustmentAmmount")
	private java.lang.Double adjustmentAmmount;

	@org.kie.api.definition.type.Label("taxAmmount")
	private java.lang.Double taxAmmount;

	public AccountInfo() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getBillingAccount() {
		return this.billingAccount;
	}

	public void setBillingAccount(java.lang.String billingAccount) {
		this.billingAccount = billingAccount;
	}

	public java.lang.Double getAdjustmentAmmount() {
		return this.adjustmentAmmount;
	}

	public void setAdjustmentAmmount(java.lang.Double adjustmentAmmount) {
		this.adjustmentAmmount = adjustmentAmmount;
	}

	public java.lang.Double getTaxAmmount() {
		return this.taxAmmount;
	}

	public void setTaxAmmount(java.lang.Double taxAmmount) {
		this.taxAmmount = taxAmmount;
	}

	public AccountInfo(java.lang.Long id, java.lang.String billingAccount,
			java.lang.Double adjustmentAmmount, java.lang.Double taxAmmount) {
		this.id = id;
		this.billingAccount = billingAccount;
		this.adjustmentAmmount = adjustmentAmmount;
		this.taxAmmount = taxAmmount;
	}

}