package com.panapi.response;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PanModel {
	
	private String PanNumber;
	private int source_id;
	private String Name;
	private String LastUpdate;
	private String NameOnTheCard;
	private String Status;
	private String StatusDescription;
	private String Gender;
	private String State;
	private String Mobile;
	private String Age;
	private String tsTransld;
	private String secretToken;
	private String captchaCode;
	private String BankAccountNumber;
	private String IFSCCode;
	private String AccountHolderName;
	private String BankName;
	private String BankBranchAddress;
	private String dob;
	private String doc_id;
	private String doi;
	private String father_name;
	private String is_scanned;
	private String minor;
	private String scan_type;
	private String street_address;
	private String pincode;
	private String verificationResponse;
	public String getPanNumber() {
		return PanNumber;
	}
	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}
	public int getSource_id() {
		return source_id;
	}
	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		LastUpdate = lastUpdate;
	}
	public String getNameOnTheCard() {
		return NameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		NameOnTheCard = nameOnTheCard;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getStatusDescription() {
		return StatusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		StatusDescription = statusDescription;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getTsTransld() {
		return tsTransld;
	}
	public void setTsTransld(String tsTransld) {
		this.tsTransld = tsTransld;
	}
	public String getSecretToken() {
		return secretToken;
	}
	public void setSecretToken(String secretToken) {
		this.secretToken = secretToken;
	}
	public String getCaptchaCode() {
		return captchaCode;
	}
	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}
	public String getBankAccountNumber() {
		return BankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		BankAccountNumber = bankAccountNumber;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankBranchAddress() {
		return BankBranchAddress;
	}
	public void setBankBranchAddress(String bankBranchAddress) {
		BankBranchAddress = bankBranchAddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getIs_scanned() {
		return is_scanned;
	}
	public void setIs_scanned(String is_scanned) {
		this.is_scanned = is_scanned;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public String getScan_type() {
		return scan_type;
	}
	public void setScan_type(String scan_type) {
		this.scan_type = scan_type;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getVerificationResponse() {
		return verificationResponse;
	}
	public void setVerificationResponse(String verificationResponse) {
		this.verificationResponse = verificationResponse;
	}
	@JsonCreator
	public PanModel(@JsonProperty("PanNumber") String panNumber,@JsonProperty("source_id") int source_id,@JsonProperty("Name")String name,@JsonProperty("LastUpdate")String lastUpdate,@JsonProperty("NameOnTheCard") String nameOnTheCard,@JsonProperty("STATUS") String status,
			@JsonProperty("StatusDescription") String statusDescription,@JsonProperty("Gender") String gender,@JsonProperty("State") String state,@JsonProperty("Mobile") String mobile,@JsonProperty("age") String age,@JsonProperty("tsTransId") String tsTransld,
			@JsonProperty("secretToken") String secretToken,@JsonProperty("captchaCode") String captchaCode,@JsonProperty("BankAccountNumber") String bankAccountNumber,@JsonProperty("IFSCCode") String iFSCCode,@JsonProperty("AccountHolderName") String accountHolderName,
			@JsonProperty("BankName") String bankName,@JsonProperty("BankBranchAddress") String bankBranchAddress,@JsonProperty("dob") String dob,@JsonProperty("doc_id") String doc_id,@JsonProperty("doi") String doi,@JsonProperty("father_name") String father_name,
			@JsonProperty("is_scanned") String is_scanned,@JsonProperty("minor") String minor,@JsonProperty("scan_type") String scan_type,@JsonProperty("street_address") String street_address,@JsonProperty("pincode") String pincode,
			@JsonProperty("verificationResponse") String verificationResponse) {
		super();
		PanNumber = panNumber;
		this.source_id = source_id;
		Name = name;
		LastUpdate = lastUpdate;
		NameOnTheCard = nameOnTheCard;
		Status = status;
		StatusDescription = statusDescription;
		Gender = gender;
		State = state;
		Mobile = mobile;
		Age = age;
		this.tsTransld = tsTransld;
		this.secretToken = secretToken;
		this.captchaCode = captchaCode;
		BankAccountNumber = bankAccountNumber;
		IFSCCode = iFSCCode;
		AccountHolderName = accountHolderName;
		BankName = bankName;
		BankBranchAddress = bankBranchAddress;
		this.dob = dob;
		this.doc_id = doc_id;
		this.doi = doi;
		this.father_name = father_name;
		this.is_scanned = is_scanned;
		this.minor = minor;
		this.scan_type = scan_type;
		this.street_address = street_address;
		this.pincode = pincode;
		this.verificationResponse = verificationResponse;
	}
	public PanModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PanModel [PanNumber=" + PanNumber + ", source_id=" + source_id + ", Name=" + Name + ", LastUpdate="
				+ LastUpdate + ", NameOnTheCard=" + NameOnTheCard + ", Status=" + Status + ", StatusDescription="
				+ StatusDescription + ", Gender=" + Gender + ", State=" + State + ", Mobile=" + Mobile + ", Age=" + Age
				+ ", tsTransld=" + tsTransld + ", secretToken=" + secretToken + ", captchaCode=" + captchaCode
				+ ", BankAccountNumber=" + BankAccountNumber + ", IFSCCode=" + IFSCCode + ", AccountHolderName="
				+ AccountHolderName + ", BankName=" + BankName + ", BankBranchAddress=" + BankBranchAddress + ", dob="
				+ dob + ", doc_id=" + doc_id + ", doi=" + doi + ", father_name=" + father_name + ", is_scanned="
				+ is_scanned + ", minor=" + minor + ", scan_type=" + scan_type + ", street_address=" + street_address
				+ ", pincode=" + pincode + ", verificationResponse=" + verificationResponse + "]";
	}

}
