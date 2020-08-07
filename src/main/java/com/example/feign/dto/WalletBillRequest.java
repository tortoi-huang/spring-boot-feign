package com.example.feign.dto;

public class WalletBillRequest {
    private String month;
    private String[] cardNos;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String[] getCardNos() {
        return cardNos;
    }

    public void setCardNos(String[] cardNos) {
        this.cardNos = cardNos;
    }
}
