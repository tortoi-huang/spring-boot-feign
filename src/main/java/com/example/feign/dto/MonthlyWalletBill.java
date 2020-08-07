package com.example.feign.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MonthlyWalletBill implements Serializable {
    private Long id;

    private Integer month;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fromTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date toTime;

    private String cardNo;

    private Long walletId;

    private String subjectCode;

    private BigDecimal openingBalance;

    private BigDecimal closingBalance;

    private BigDecimal recharge;

    private BigDecimal payCharge;

    private BigDecimal refund;

    private BigDecimal settle;

    private BigDecimal adjust;

    private BigDecimal withdraw;

    private BigDecimal payFund;

    private BigDecimal pay;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long isDelete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }

    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
    }

    public BigDecimal getRecharge() {
        return recharge;
    }

    public void setRecharge(BigDecimal recharge) {
        this.recharge = recharge;
    }

    public BigDecimal getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(BigDecimal payCharge) {
        this.payCharge = payCharge;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public BigDecimal getSettle() {
        return settle;
    }

    public void setSettle(BigDecimal settle) {
        this.settle = settle;
    }

    public BigDecimal getAdjust() {
        return adjust;
    }

    public void setAdjust(BigDecimal adjust) {
        this.adjust = adjust;
    }

    public BigDecimal getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(BigDecimal withdraw) {
        this.withdraw = withdraw;
    }

    public BigDecimal getPayFund() {
        return payFund;
    }

    public void setPayFund(BigDecimal payFund) {
        this.payFund = payFund;
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", month=").append(month);
        sb.append(", fromTime=").append(fromTime);
        sb.append(", toTime=").append(toTime);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", walletId=").append(walletId);
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", openingBalance=").append(openingBalance);
        sb.append(", closingBalance=").append(closingBalance);
        sb.append(", recharge=").append(recharge);
        sb.append(", payCharge=").append(payCharge);
        sb.append(", refund=").append(refund);
        sb.append(", settle=").append(settle);
        sb.append(", adjust=").append(adjust);
        sb.append(", withdraw=").append(withdraw);
        sb.append(", payFund=").append(payFund);
        sb.append(", pay=").append(pay);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}