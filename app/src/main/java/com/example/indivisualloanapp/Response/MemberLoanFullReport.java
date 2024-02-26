package com.example.indivisualloanapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberLoanFullReport {

    @SerializedName("ApplicationAmount")
    @Expose
    private String applicationAmount;
    @SerializedName("ApplicationDate")
    @Expose
    private String applicationDate;
    @SerializedName("ApprovalAmount")
    @Expose
    private String approvalAmount;
    @SerializedName("ApprovalDate")
    @Expose
    private String approvalDate;
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("CloseAmount")
    @Expose
    private String closeAmount;
    @SerializedName("CloseDate")
    @Expose
    private String closeDate;
    @SerializedName("CloseMode")
    @Expose
    private Object closeMode;
    @SerializedName("DisburseAmount")
    @Expose
    private String disburseAmount;
    @SerializedName("DisburseDate")
    @Expose
    private String disburseDate;
    @SerializedName("DisburseMode")
    @Expose
    private String disburseMode;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("FeePayMode")
    @Expose
    private String feePayMode;
    @SerializedName("ILoanTypeNo")
    @Expose
    private String iLoanTypeNo;
    @SerializedName("InsuranceFee")
    @Expose
    private String insuranceFee;
    @SerializedName("InterestMethod")
    @Expose
    private String interestMethod;
    @SerializedName("InterestRate")
    @Expose
    private String interestRate;
    @SerializedName("LoanAmount")
    @Expose
    private String loanAmount;
    @SerializedName("LoanCycle")
    @Expose
    private String loanCycle;
    @SerializedName("LoanFunder")
    @Expose
    private String loanFunder;
    @SerializedName("LoanId")
    @Expose
    private String loanId;
    @SerializedName("LoanPurpose")
    @Expose
    private String loanPurpose;
    @SerializedName("LoanStatus")
    @Expose
    private String loanStatus;
    @SerializedName("LoanTerm")
    @Expose
    private String loanTerm;
    @SerializedName("MemberId")
    @Expose
    private String memberId;
    @SerializedName("MemberName")
    @Expose
    private String memberName;
    @SerializedName("OfficerName")
    @Expose
    private String officerName;
    @SerializedName("OtherFee")
    @Expose
    private String otherFee;
    @SerializedName("ProcessingFee")
    @Expose
    private String processingFee;
    @SerializedName("SecurityFee")
    @Expose
    private String securityFee;
    @SerializedName("ServiceTax")
    @Expose
    private String serviceTax;
    @SerializedName("TotalFee")
    @Expose
    private String totalFee;
    @SerializedName("TotalInterest")
    @Expose
    private String totalInterest;


    public String getApplicationAmount() {
        return applicationAmount;
    }

    public void setApplicationAmount(String applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(String approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCloseAmount() {
        return closeAmount;
    }

    public void setCloseAmount(String closeAmount) {
        this.closeAmount = closeAmount;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public Object getCloseMode() {
        return closeMode;
    }

    public void setCloseMode(Object closeMode) {
        this.closeMode = closeMode;
    }

    public String getDisburseAmount() {
        return disburseAmount;
    }

    public void setDisburseAmount(String disburseAmount) {
        this.disburseAmount = disburseAmount;
    }

    public String getDisburseDate() {
        return disburseDate;
    }

    public void setDisburseDate(String disburseDate) {
        this.disburseDate = disburseDate;
    }

    public String getDisburseMode() {
        return disburseMode;
    }

    public void setDisburseMode(String disburseMode) {
        this.disburseMode = disburseMode;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getFeePayMode() {
        return feePayMode;
    }

    public void setFeePayMode(String feePayMode) {
        this.feePayMode = feePayMode;
    }

    public String getILoanTypeNo() {
        return iLoanTypeNo;
    }

    public void setILoanTypeNo(String iLoanTypeNo) {
        this.iLoanTypeNo = iLoanTypeNo;
    }

    public String getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(String insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public String getInterestMethod() {
        return interestMethod;
    }

    public void setInterestMethod(String interestMethod) {
        this.interestMethod = interestMethod;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanCycle() {
        return loanCycle;
    }

    public void setLoanCycle(String loanCycle) {
        this.loanCycle = loanCycle;
    }

    public String getLoanFunder() {
        return loanFunder;
    }

    public void setLoanFunder(String loanFunder) {
        this.loanFunder = loanFunder;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String otherFee) {
        this.otherFee = otherFee;
    }

    public String getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(String processingFee) {
        this.processingFee = processingFee;
    }

    public String getSecurityFee() {
        return securityFee;
    }

    public void setSecurityFee(String securityFee) {
        this.securityFee = securityFee;
    }

    public String getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(String serviceTax) {
        this.serviceTax = serviceTax;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }
        }
