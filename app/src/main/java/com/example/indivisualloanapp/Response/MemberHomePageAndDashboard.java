package com.example.indivisualloanapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberHomePageAndDashboard {
        @SerializedName("BalanceInterest")
        @Expose
        private String balanceInterest;
        @SerializedName("BalancePenalty")
        @Expose
        private String balancePenalty;
        @SerializedName("BalancePrincipal")
        @Expose
        private String balancePrincipal;
        @SerializedName("BalanceTotal")
        @Expose
        private String balanceTotal;
        @SerializedName("BranchName")
        @Expose
        private String branchName;
        @SerializedName("LastPaidDate")
        @Expose
        private String lastPaidDate;
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
        @SerializedName("LoanTermMode")
        @Expose
        private String loanTermMode;
        @SerializedName("MemberId")
        @Expose
        private String memberId;
        @SerializedName("MemberName")
        @Expose
        private String memberName;
        @SerializedName("OfficerName")
        @Expose
        private String officerName;
        @SerializedName("PaidInterest")
        @Expose
        private String paidInterest;
        @SerializedName("PaidPenalty")
        @Expose
        private String paidPenalty;
        @SerializedName("PaidPrincipal")
        @Expose
        private String paidPrincipal;
        @SerializedName("PaidTerm")
        @Expose
        private Object paidTerm;
        @SerializedName("PaidTotal")
        @Expose
        private String paidTotal;
        @SerializedName("TotalInterest")
        @Expose
        private String totalInterest;
        @SerializedName("TotalPayable")
        @Expose
        private String totalPayable;
        @SerializedName("TotalPenalty")
        @Expose
        private String totalPenalty;
        @SerializedName("TotalTerm")
        @Expose
        private String totalTerm;


        public String getBalanceInterest() {
        return balanceInterest;
    }

        public void setBalanceInterest(String balanceInterest) {
        this.balanceInterest = balanceInterest;
    }

        public String getBalancePenalty() {
        return balancePenalty;
    }

        public void setBalancePenalty(String balancePenalty) {
        this.balancePenalty = balancePenalty;
    }

        public String getBalancePrincipal() {
        return balancePrincipal;
    }

        public void setBalancePrincipal(String balancePrincipal) {
        this.balancePrincipal = balancePrincipal;
    }

        public String getBalanceTotal() {
        return balanceTotal;
    }

        public void setBalanceTotal(String balanceTotal) {
        this.balanceTotal = balanceTotal;
    }

        public String getBranchName() {
        return branchName;
    }

        public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

        public String getLastPaidDate() {
        return lastPaidDate;
    }

        public void setLastPaidDate(String lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
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

        public String getLoanTermMode() {
        return loanTermMode;
    }

        public void setLoanTermMode(String loanTermMode) {
        this.loanTermMode = loanTermMode;
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

        public String getPaidInterest() {
        return paidInterest;
    }

        public void setPaidInterest(String paidInterest) {
        this.paidInterest = paidInterest;
    }

        public String getPaidPenalty() {
        return paidPenalty;
    }

        public void setPaidPenalty(String paidPenalty) {
        this.paidPenalty = paidPenalty;
    }

        public String getPaidPrincipal() {
        return paidPrincipal;
    }

        public void setPaidPrincipal(String paidPrincipal) {
        this.paidPrincipal = paidPrincipal;
    }

        public Object getPaidTerm() {
        return paidTerm;
    }

        public void setPaidTerm(Object paidTerm) {
        this.paidTerm = paidTerm;
    }

        public String getPaidTotal() {
        return paidTotal;
    }

        public void setPaidTotal(String paidTotal) {
        this.paidTotal = paidTotal;
    }

        public String getTotalInterest() {
        return totalInterest;
    }

        public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

        public String getTotalPayable() {
        return totalPayable;
    }

        public void setTotalPayable(String totalPayable) {
        this.totalPayable = totalPayable;
    }

        public String getTotalPenalty() {
        return totalPenalty;
    }

        public void setTotalPenalty(String totalPenalty) {
        this.totalPenalty = totalPenalty;
    }

        public String getTotalTerm() {
        return totalTerm;
    }

        public void setTotalTerm(String totalTerm) {
        this.totalTerm = totalTerm;
    }

    }
