package com.example.indivisualloanapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberLoanCardPrinting {

    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("DisburseDate")
    @Expose
    private String disburseDate;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("ILoanTypeNo")
    @Expose
    private String iLoanTypeNo;
    @SerializedName("InterestMethod")
    @Expose
    private String interestMethod;
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

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getDisburseDate() {
        return disburseDate;
    }

    public void setDisburseDate(String disburseDate) {
        this.disburseDate = disburseDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getILoanTypeNo() {
        return iLoanTypeNo;
    }

    public void setILoanTypeNo(String iLoanTypeNo) {
        this.iLoanTypeNo = iLoanTypeNo;
    }

    public String getInterestMethod() {
        return interestMethod;
    }

    public void setInterestMethod(String interestMethod) {
        this.interestMethod = interestMethod;
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
}
